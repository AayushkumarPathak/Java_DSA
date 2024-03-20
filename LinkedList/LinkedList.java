import java.util.Scanner;
public class LinkedList {
    private int size;

    LinkedList(){
        this.size = 0;
    }
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insertLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        
    }
    public void printlist(){
        Node curr = head;

        if(head == null){
            System.out.println("Empty");
            return;
        }
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr = curr.next;
        }
        System.out.print("null\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        System.out.print("ENter size:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int ele = sc.nextInt();
            ll.insertLast(ele);
        }
        ll.printlist();

        sc.close();
    
    }
    
}
