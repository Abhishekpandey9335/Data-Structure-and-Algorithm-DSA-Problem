// Imelementation of Stack using Linked List
// First of all making  a Node class


import java.util.ArrayList;
import java.util.Stack;

public class StackUsingArrayList {
    class satck {
        // make a ArayList
        static ArrayList<Integer> list = new ArrayList<>();

        // make function for checking stack is empty or not
        public static boolean isEmpty() {
            return list.size() == 0;

        }

        // make a push function
        public static void push(int data) {
            list.add(data);
        }

        // make a pop function
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            // pop krne ke liye hmen apne ArrayList ka top element nikalna pdega aur ye get fjunction se niklega
            int top = list.get(list.size() - 1);//list.size()-1 == list ka last element
            list.remove(list.size() - 1);
            return top;

        }

        //make a function for peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }


    }


    public static void main(String args[]) {
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