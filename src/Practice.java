

public class Practice {
    // Implementation of stack using LinkedList
// first of all make a Node class
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next = null;
        }
    }
    //make a stack class\
    static class Stack{
        // make a head of LL and Top of Stack
        public static Node head;
        // write a code for checking stack is Empty or not
        public static boolean isEmpty(){
            return head == null;

            }
            // making a push function
        public static void push(int data){
            //Create a new Node
            Node newNode = new Node(data);
            // agr hmari LL ya Stack Empty ho to
            if(isEmpty()){
                head = newNode;
                return;
            }
            //Insertion at Head
            newNode.next = head;
            head = newNode;

        }
        // make a pop function
        public static int pop(){
            if(isEmpty()){
                return -1;

            }
            int top = head.data;
            // for deleting
            head = head.next;
            return top;

        }
        //make a peek function
        public static int peek(){
            //check satck is Empty or Not
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

        }

    public static void main(String[] args) {
        // make a actual Stack Data Structrure
        Stack s = new Stack();
        s.push(3);
        s.push(2);
        s.push(2);
        s.push(2);

        // make a function for printing satck
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }
    }
    }


