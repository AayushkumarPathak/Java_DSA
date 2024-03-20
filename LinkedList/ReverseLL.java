import java.util.*;
public class ReverseLL {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;

        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    void printLL(){
        Node curr = head;
        if(head == null){
            System.out.println("Empty");
            return;
        }
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public void reverse(){
        Node prev = null;
        Node curr = head; 
        Node nxt;

        while(curr!=null){
           nxt = curr.next;
           curr.next = prev;
           prev = curr;
           curr = nxt;
        }
        head = prev;
    }

    public static void main(String[] args) {
        ReverseLL ll = new ReverseLL();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int ele = sc.nextInt();
            ll.addLast(ele);
        }
        System.out.println("Before reverse:");
        ll.printLL();

        ll.reverse();
        System.out.println("\nAfter reverse:");
        ll.printLL();

        sc.close();
    }
    
}
