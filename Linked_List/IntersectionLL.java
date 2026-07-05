package Linked_List;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class GetIntersectionLL {
    public Node getIntersectionNode(Node headA, Node headB) {
            Node p1 = headA;
            Node p2 = headB;

        while(p1 != p2) { 
            if(p1 == null)
                p1 = headB;
            else
                p1 = p1.next;

            if(p2 == null)
                p2 = headA;
            else
                p2 = p2.next;
        }

        return p1;

}
}
public class IntersectionLL {
    public static void main(String[] args) {
        Node headA = new Node(4);
        headA.next = new Node(5);
        headA.next.next = new Node(6);
        headA.next.next.next = new Node(7);
        headA.next.next.next.next = new Node(8);
        headA.next.next.next.next.next = new Node(9);

        Node headB = new Node(1);
        headB.next = new Node(2);
        headB.next.next = headA.next.next.next.next.next; 

        GetIntersectionLL solution = new GetIntersectionLL();
        Node intersectionNode = solution.getIntersectionNode(headA, headB);

        if (intersectionNode != null) {
            System.out.println("Intersection at node with value: " + intersectionNode.data);
        } else {
            System.out.println("No intersection found.");
        }
    }
}

