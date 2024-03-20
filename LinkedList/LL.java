<<<<<<< HEAD
class LL{
    Node head;
    private int size;
    LL(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
         

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //add  - first, last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
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

    //print
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
    //deleteFirst
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
        
    }
    //deleteLast
   
    public void deleteLast(){
        //corner case1:
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        //corner case2:
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
    //searching in LinkedList
     public int search(String element){
        if(head == null){
            System.out.println("Empty");
        }
        int idx = 0;
        Node currNode = head;
        while(currNode != null){
            if(currNode.data == element){
                return idx;
            }
            idx++;
            currNode = currNode.next;
        }
        return -1;
    }
    public static void main(String[] args) {
        LL list  = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();


        
        list.addLast("list");
        list.addFirst("This");
        list.printList();

        // list.deleteFirst();
        // list.printList();

        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());

        String element = "This";
        int ans = list.search(element);
        if(ans == -1){
            System.out.println("Element not found in the LinkedList");

        }
        else{
            System.out.println("Element found in the LinkedList at: "+ ans);
        }
        

        
      
        
      
    }
=======
class LL{
    Node head;
    private int size;
    LL(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;
         

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //add  - first, last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
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

    //print
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
    //deleteFirst
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
        
    }
    //deleteLast
   
    public void deleteLast(){
        //corner case1:
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        //corner case2:
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
    //searching in LinkedList
     public int search(String element){
        if(head == null){
            System.out.println("Empty");
        }
        int idx = 0;
        Node currNode = head;
        while(currNode != null){
            if(currNode.data == element){
                return idx;
            }
            idx++;
            currNode = currNode.next;
        }
        return -1;
    }
    public static void main(String[] args) {
        LL list  = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();


        
        list.addLast("list");
        list.addFirst("This");
        list.printList();

        // list.deleteFirst();
        // list.printList();

        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());

        String element = "This";
        int ans = list.search(element);
        if(ans == -1){
            System.out.println("Element not found in the LinkedList");

        }
        else{
            System.out.println("Element found in the LinkedList at: "+ ans);
        }
        

        
      
        
      
    }
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
}