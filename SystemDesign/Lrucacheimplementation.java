package SystemDesign;
//to implement LRU cache we can use doubly linked list and hashmap.
// the doubly linked list will store the keys in the order of their usage, with the most recently used key at the head and the least recently used key at the tail. 
// The hashmap will store the key-value pairs for quick access to the values based on their keys. When a key is accessed, it will be moved to the head of the list,
//  and when a new key is added, if the cache is full, the least recently used key (the one at the tail) will be removed from both the list and the hashmap.
// here's a simple implementation of an LRU cache in Java using a doubly linked list and a hashmap:
import java.util.HashMap;
import java.util.Map;   



public class Lrucacheimplementation {
    private class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> map;
    private Node head;
    private Node tail;

    public Lrucacheimplementation(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new Node(0, 0); 
        this.tail = new Node(0, 0); 
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1; 
        }
        Node node = map.get(key);
        remove(node);
        insertToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            remove(node);
            insertToHead(node);
        } else {
            if (map.size() == capacity) {
                map.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            insertToHead(newNode);
        }
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void insertToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
    public static void main(String[] args) {
        Lrucacheimplementation lruCache = new Lrucacheimplementation(2);
        lruCache.put(1, 1); 
        lruCache.put(2, 2); 
        System.out.println(lruCache.get(1));    
        lruCache.put(3, 3); 
        System.out.println(lruCache.get(2));    
        lruCache.put(4, 4); 
        System.out.println(lruCache.get(1));    
        System.out.println(lruCache.get(3));    
        System.out.println(lruCache.get(4));    
    }
}



