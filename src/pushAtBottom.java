import java.util.*;
public class pushAtBottom{
    // make a new function
    public static void pushBottom( int data , Stack<Integer> s){
        //base case
        if(s.isEmpty()){
            s.push(data);
            return;

        }

        int top = s.pop();
        pushBottom(data , s);
        s.push(top);

    }
public static void main(String args[]){
    // make a actual stack data structure
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);

    pushBottom(4 , s);

    // make a loop tbb tkk apne sare ke sare stack ke element ko print kraye
    while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();

    }
}
}