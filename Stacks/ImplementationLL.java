package Stacks;

 public class ImplementationLL {
    
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
            this.next= null;        
}
    }
    public void push(int data){
        Node newNode= new Node(data);
        if(head==null){
            head= newNode;
            return;
        }
        newNode.next= head;
        head= newNode;
    }
    public int pop(){
        if(head==null){
            System.out.println("stack underflow");
            return -1;
        }
        int top= head.data;
        head= head.next;
        return top;
    }
    public int peek(){
        if(head==null){
            System.out.println("stack underflow");
            return -1;
        }
        return head.data;
    }
    public boolean isEmpty(){
        return head==null;  
    }
    public static void main(String[] args) {
        ImplementationLL stack= new ImplementationLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}