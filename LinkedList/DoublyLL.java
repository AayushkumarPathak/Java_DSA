public class DoublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void printDLL(){
        Node curr = head;
        if(head == null){
            System.out.println("Null");
            return;
        }
        while(curr!=null){
            System.out.print(curr.data+" <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    public int removeHead(){
        if(head == null){
            System.out.println("Empty!");
            return Integer.MIN_VALUE;
        }
        //if there is only one Node
        if(size == 1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null; //then this line throw an error bcz no prev exists before
        size--;
        return val;
    }
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        
        System.out.println("Size is: "+size);
        dll.printDLL();
        
        dll.removeHead();
        System.out.println("Size: "+size);
        dll.printDLL();

    }
    
}
