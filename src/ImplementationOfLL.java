import java.util.*;
class Node {

    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

public class ImplementationOfLL {
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val);
            temp= temp.next;
        }

    }
    public static void main(String[] args) {

        // for taking input
        Scanner sc = new Scanner(System.in);
        // on the behalf of constructor
        Node a = new Node(sc.nextInt());
        Node b = new Node(sc.nextInt());
        Node c = new Node (sc.nextInt());
        Node d = new Node(sc.nextInt());
        Node e = new Node (sc.nextInt());
        Node f = new Node(sc.nextInt());


        // connection of nodes to each other
        a.next = b;
        a.next.next=c;

        c.next =d;
        d.next = e;
        e.next= f;
        display(a);

    }
}