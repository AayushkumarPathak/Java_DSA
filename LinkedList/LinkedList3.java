<<<<<<< HEAD
public class LinkedList3 {
    Node head; 
    private int size;

    LinkedList3(){
        this.size = 0;
    }
    
    class Node{
        String desig;
        Node next;
        
        Node(String desig){
            this.desig = desig;
            this.next = null;
            size++;
        }
    }

    public void addLast(String desig){
        Node newNode = new Node(desig);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;//error1 -- Only one error,1 time error--
    }    

    public void printList(){
        if(head == null){
            System.out.println("LinkedList is Empty!$$");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.desig+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("LinkedList is Empty!**");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize(){
        return size;
    }

    /*  __main__    */
    public static void main(String[] args) {
        LinkedList3 ll = new LinkedList3();
        ll.addLast("CEO");
        ll.addLast("CA");
        ll.addLast("GM");
        ll.addLast("SSM");
        ll.addLast("Manager");
        ll.addLast("TM");
        ll.addLast("MM");
        ll.addLast("AM");
        ll.printList();

        //deleting last iteam
        ll.deleteLast();
        ll.printList();
        System.out.println("Length of LinkedList is:"+ll.getSize());
        
    }

    
}
=======
public class LinkedList3 {
    Node head; 
    private int size;

    LinkedList3(){
        this.size = 0;
    }
    
    class Node{
        String desig;
        Node next;
        
        Node(String desig){
            this.desig = desig;
            this.next = null;
            size++;
        }
    }

    public void addLast(String desig){
        Node newNode = new Node(desig);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;//error1 -- Only one error,1 time error--
    }    

    public void printList(){
        if(head == null){
            System.out.println("LinkedList is Empty!$$");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.desig+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("LinkedList is Empty!**");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize(){
        return size;
    }

    /*  __main__    */
    public static void main(String[] args) {
        LinkedList3 ll = new LinkedList3();
        ll.addLast("CEO");
        ll.addLast("CA");
        ll.addLast("GM");
        ll.addLast("SSM");
        ll.addLast("Manager");
        ll.addLast("TM");
        ll.addLast("MM");
        ll.addLast("AM");
        ll.printList();

        //deleting last iteam
        ll.deleteLast();
        ll.printList();
        System.out.println("Length of LinkedList is:"+ll.getSize());
        
    }

    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
