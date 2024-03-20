<<<<<<< HEAD
public class LinkedList1 {
    Node head;
    class Node{
        int roll;
        
        Node next;

        Node(int roll){
            this.roll = roll;
            
            this.next = null;
        }
    }
    //insert
     public void insert(int roll){
            Node newNode = new Node(roll);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        //print list
        public void printList(){
            if(head == null){
                System.out.println("LinkedList is empty! ");
                return;
            }
            Node currNode = head;
            while(currNode != null){
                System.out.print(currNode.roll+" -> ");
                currNode = currNode.next;
                
            }
            System.out.println("null");

        }
    public static void main(String[] args) {
        LinkedList1 l = new LinkedList1();
        l.insert(1);
        l.insert(2);
        l.printList();
    }
    
}
=======
public class LinkedList1 {
    Node head;
    class Node{
        int roll;
        
        Node next;

        Node(int roll){
            this.roll = roll;
            
            this.next = null;
        }
    }
    //insert
     public void insert(int roll){
            Node newNode = new Node(roll);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        //print list
        public void printList(){
            if(head == null){
                System.out.println("LinkedList is empty! ");
                return;
            }
            Node currNode = head;
            while(currNode != null){
                System.out.print(currNode.roll+" -> ");
                currNode = currNode.next;
                
            }
            System.out.println("null");

        }
    public static void main(String[] args) {
        LinkedList1 l = new LinkedList1();
        l.insert(1);
        l.insert(2);
        l.printList();
    }
    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
