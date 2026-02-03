package Linked_List;
class CircularLL{
    Node head ;

    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
        }
    }
    void insertatHead(int data){
        Node newnNode=new Node(data);
        if (head==null){
            head=newnNode;
            newnNode.next=head;
            return;
        }
        Node tail=head;
        while(tail.next!=head){
            tail=tail.next;
        }
        newnNode.next=head;
        tail.next=newnNode;
        head=newnNode;

    }
    void insertBetween(int data , int position){
        Node newNode= new Node(data);
        if (position==0){
            insertatHead(data);
        }
        int index=0;
        Node curr=head;
        while(curr.next!=head && index<position-1){
            curr=curr.next;
            index++;
        }
        
        newNode.next=curr.next;
        curr.next=newNode;

    }

    void deleteNode(int data){
        Node curr=head.next;
        Node prev=head;

        while(curr!=head){
            if(curr.data==data){
                prev.next=curr.next;
                return;
            }
            prev=curr;
            curr=curr.next;
        }
    }
    void printCll(){
        Node tail=head;
        int length=1;
        while(tail.next!=head){
            System.out.print(tail.data + " ");
            tail=tail.next;
            length=length+1;
        }
        System.out.print(tail.data);
        System.out.println("Length of LL is "+ length);
        return;
    }
}
public class implementation_CircularLL {
    public static void main(String[] args) {
        
    
    CircularLL MycLL= new CircularLL();
    MycLL.insertatHead(20);
    MycLL.insertatHead(30);
    MycLL.insertBetween(70, 1);
    MycLL.printCll();
    MycLL.deleteNode(70);
    MycLL.printCll();
    }
}
