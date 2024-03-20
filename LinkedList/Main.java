<<<<<<< HEAD
public class Main
{
    public int element;
    Node head;
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    //insert 
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
    
    public int search(int element){
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
    
    //printl
    public void printList(){
        if(head == null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
        
    }
	
	
	
	
	public static void main(String[] args) {
		Main list = new Main();
        //1 5 7 3 8 6 2
		list.addLast(1);
		list.addLast(5);
		list.addLast(7);
		list.addLast(3);
		list.addLast(8);
		list.addLast(6);
		list.addLast(2);
		list.printList();

        int element = 7;
        int ans = list.search(element);
        if(ans == -1){
            System.out.println("Element not found in the LinkedList");

        }
        else{
            System.out.println("Element found in the LinkedList at: "+ ans);
        }
		
		
	}
}
=======
public class Main
{
    public int element;
    Node head;
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    //insert 
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
    
    public int search(int element){
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
    
    //printl
    public void printList(){
        if(head == null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
        
    }
	
	
	
	
	public static void main(String[] args) {
		Main list = new Main();
        //1 5 7 3 8 6 2
		list.addLast(1);
		list.addLast(5);
		list.addLast(7);
		list.addLast(3);
		list.addLast(8);
		list.addLast(6);
		list.addLast(2);
		list.printList();

        int element = 7;
        int ans = list.search(element);
        if(ans == -1){
            System.out.println("Element not found in the LinkedList");

        }
        else{
            System.out.println("Element found in the LinkedList at: "+ ans);
        }
		
		
	}
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
