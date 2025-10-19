// Imelementation of Stack using Linked List
// First of all making  a Node class


public class Main {
    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    // make a stack class
    static class Stack{
        // make a head of LL and top of our stack
        public static Node head; // static isliye ki ek hi node hai
        // write a function for checking LL / Stack is empty or not
        public static boolean isEmpty(){
            return head == null;
        }
        // Now implementing a push function iske andar koi data ayega aur ise hme LL ke haead pe push karan ai
        public static void push(int data){
            // Create a new Node
            Node newNode = new Node(data);
            if(isEmpty()){//hmari LL empty hai
                head = newNode;
                return;

            }
            // Insertion at head
            newNode.next = head;
            head = newNode;
        }
        // make a pop Function
        public static int pop(){
            if(isEmpty()){
                return -1;// -1 represent to stack khali hai
            }
            int top = head.data;
            // for deleting
            head = head.next;
            return top ;
        }
        // make a peek function
        public static int peek() {
            if (isEmpty()) {
                return -1;// -1 represent to stack khali hai
            }
            return head.data;
        }
}
    public static void main(String args[]){
        // make a actual stack data structure
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        // make a loop tbb tkk apne sare ke sare stack ke element ko print kraye
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }
    }
}