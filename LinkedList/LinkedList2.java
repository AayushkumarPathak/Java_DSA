<<<<<<< HEAD
public class LinkedList2 {
    Node head;
    class Node{
        String branch;
        Node next;

        Node(String branch){
            this.branch = branch;
            this.next = null;
        }
    }
    //addLast
    public void addLast(String branch){
        Node newNode = new Node(branch);
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
            System.out.println("List is empty!");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.branch + " ~> ");
            currNode = currNode.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        LinkedList2 l2 = new LinkedList2();
        l2.addLast("CSE");
        l2.addLast("MEC");
        l2.addLast("ECE");
        l2.printlist();
    }
    
}
=======
public class LinkedList2 {
    Node head;
    class Node{
        String branch;
        Node next;

        Node(String branch){
            this.branch = branch;
            this.next = null;
        }
    }
    //addLast
    public void addLast(String branch){
        Node newNode = new Node(branch);
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
            System.out.println("List is empty!");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.branch + " ~> ");
            currNode = currNode.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
        LinkedList2 l2 = new LinkedList2();
        l2.addLast("CSE");
        l2.addLast("MEC");
        l2.addLast("ECE");
        l2.printlist();
    }
    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
