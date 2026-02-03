package Linked_List;
class MyDoublyll{
    Node head,tail;

    class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}


    void insertdataHead(int data){
        Node newnode= new Node(data);
        
        if(head==null){
            head=newnode;
            tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
    void inserttail(int data){
        Node newnNode= new Node(data);
        Node curr= head;
        if(head==null){
            head=newnNode;
            tail=newnNode;
            return;
        }
        // else{
        //     tail.next=newnNode;
        //     newnNode.prev=tail;
        //     tail=newnNode;
        // }
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newnNode;
        newnNode.prev=curr;
    }

    void insertAtposition(int data ,int position){
       Node newnNode=new Node(data);
       Node curr=head;
        if(position==0){
           newnNode.next=head;
           head.prev=newnNode;
           head=newnNode;
        }
        if(position>0){
            int index=0;
            while(curr!=null && index<position-1){
                curr=curr.next;
                index++;
            }
            newnNode.next=curr.next;
            newnNode.prev=curr;
            curr.next=newnNode;

        }
    }    
    void deleteDll(int data){
        Node curr=head;
        while(curr!=null && curr.data!=data){
            curr=curr.next;
        }
        curr.prev.next=curr.next;
        if(curr.next!=null){
            curr.next.prev=curr.prev;
        }


    }
    void printDll(){
        Node curr=head;
        System.out.println("Printing the nodes");
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
        System.out.println("");
        return ;
    }

}
public class implementation_doubly_ll {
    public static void main(String[] args) {
        MyDoublyll examp= new MyDoublyll();
        examp.insertdataHead(3);
        examp.insertdataHead(5);
        examp.inserttail(5);
        examp.inserttail(7);
        examp.insertAtposition(11, 2);
        examp.printDll();
        examp.deleteDll(11);
        examp.printDll();
        
        
    }
}
