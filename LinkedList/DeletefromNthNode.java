<<<<<<< HEAD
import java.util.Scanner;
public class DeletefromNthNode {
    Node head;
    class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public void addLast(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    //printing
    public void printlist(){
        if(head == null){
            System.out.println("Empty LinkedList");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.val+" -> ");
            currNode = currNode.next;
        }
        
        System.out.println("null");
    }

    public Node removeNthFromEnd(Node head,int n){
        if(head == null){
            return null;
        }
        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(n == size){
            return head.next;
        }

        int idxToSearch = size - n;
        int i = 1;
        Node prevNode = head;
        while(i < idxToSearch){
            prevNode = prevNode.next;
            i++;
        }
        prevNode.next = prevNode.next.next;
        return head;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeletefromNthNode list = new DeletefromNthNode();

        System.out.print("Enter the size:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the val:");
            int val = sc.nextInt();
            list.addLast(val);
        }
        list.printlist();
        // System.out.println(list.removeNthFromEnd(list.head,n));
        list.removeNthFromEnd(list.head, n);
        System.out.println("updated list");
        list.printlist();


        sc.close();
       
    }
    
}
=======
import java.util.Scanner;
public class DeletefromNthNode {
    Node head;
    class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public void addLast(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    //printing
    public void printlist(){
        if(head == null){
            System.out.println("Empty LinkedList");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.val+" -> ");
            currNode = currNode.next;
        }
        
        System.out.println("null");
    }

    public Node removeNthFromEnd(Node head,int n){
        if(head == null){
            return null;
        }
        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(n == size){
            return head.next;
        }

        int idxToSearch = size - n;
        int i = 1;
        Node prevNode = head;
        while(i < idxToSearch){
            prevNode = prevNode.next;
            i++;
        }
        prevNode.next = prevNode.next.next;
        return head;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeletefromNthNode list = new DeletefromNthNode();

        System.out.print("Enter the size:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter the val:");
            int val = sc.nextInt();
            list.addLast(val);
        }
        list.printlist();
        // System.out.println(list.removeNthFromEnd(list.head,n));
        list.removeNthFromEnd(list.head, n);
        System.out.println("updated list");
        list.printlist();


        sc.close();
       
    }
    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
