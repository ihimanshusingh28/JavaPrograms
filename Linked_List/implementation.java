package Linked_List;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class MyLinkedList {
    Node head;

    void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }
    void remove(int data){

        Node curr =head.next;
        Node prev=head;
        if (head==null){
            System.out.println("empty List");
        }
         if (head.data==data){
            head=head.next;
            return;
         }
        else {
            
            while(curr!=null){
                if (curr.data==data){
                      prev.next=curr.next;
                      return;

                }
                
                prev=curr;
                curr = curr.next;

            }
        }
        System.out.println("value not found");
    }
    void insert_between(int data,int position){
        Node newNode= new Node(data);
        Node curr=head;
         
        int count=0;
        if (position==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        while(curr!=null && count< position-1){
            curr=curr.next;
            count++;    
        }
        newNode.next=curr.next;
        curr.next=newNode;


    }
    void find_my_element(int target){
        Node curr =head;
        int position=0;
        while(curr!=null){
            if(curr.data==target){
                System.out.println("ELement at  "+ position);
                return;
            }
            position++;
            curr=curr.next;
        }
        System.out.println("Elemnt not Found");

    }
    void print_cum_length() {
        int length=0;
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
            length++;
        }
        System.out.println("Length of LL is " + length);
    }
}

public class implementation {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.insert_between(60,2 );
        // list.remove(10);
        list.find_my_element(30);

        list.print_cum_length();   
    }
}
