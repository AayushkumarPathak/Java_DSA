import java.util.Scanner;
public class RemoveLast {
    Node head;
    Node tail;
    private int size;

    RemoveLast(){
        this.size = 0;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addLast(int data){
        Node newNode = new Node(data);
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

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
         
         Node currNode = head;
         while(currNode != null){
            System.out.print(currNode.data +" ~> ");
            currNode = currNode.next;
        }
        System.out.println("null");
        
    }
    public int getSize(){
        return size;
    }
    public int deleteLast(){
        if(size == 0){
            System.out.println("Empty!");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // index = i = size-2 
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RemoveLast list = new RemoveLast();
        System.out.print("Enter size:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int ele = sc.nextInt();
            list.addLast(ele);
        }
        list.printList();
        System.out.println("Length of Linked List: "+list.getSize());
        list.deleteLast();
        list.printList();
        System.out.println("Length after deletion of last node: "+list.getSize());





        sc.close();
    }
    

    
}
