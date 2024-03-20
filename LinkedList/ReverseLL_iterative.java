<<<<<<< HEAD
public class ReverseLL_iterative {
     Node head;
     class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //addLast
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
    //printLinkedList
    public void display(){
        if(head == null){
            System.out.println("LinkedList is empty!");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        if(head == null || head.next == null){
            return;
        }
        

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;
    }
    public static void main(String[] args) {
         ReverseLL_iterative l = new ReverseLL_iterative();
        //  l.addLast(1);
        //  l.addLast(2);
        //  l.addLast(3);
        //  l.addLast(4);
        //  l.addLast(5);
         l.display();

         l.reverse();
         l.display();

    }
    
}
=======
public class ReverseLL_iterative {
     Node head;
     class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //addLast
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
    //printLinkedList
    public void display(){
        if(head == null){
            System.out.println("LinkedList is empty!");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        if(head == null || head.next == null){
            return;
        }
        

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;
    }
    public static void main(String[] args) {
         ReverseLL_iterative l = new ReverseLL_iterative();
        //  l.addLast(1);
        //  l.addLast(2);
        //  l.addLast(3);
        //  l.addLast(4);
        //  l.addLast(5);
         l.display();

         l.reverse();
         l.display();

    }
    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
