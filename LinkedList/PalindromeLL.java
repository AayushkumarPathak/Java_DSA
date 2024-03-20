<<<<<<< HEAD
public class PalindromeLL {
    Node head;
    
    class Node{
        int data;
        Node next;
        
        Node(int data){this.data = data; this.next = null;} 
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
            System.out.print(currNode.data +" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
        
    }
    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;

        while(curr != null)
        {
            Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
    public Node findMiddle(Node head){
        Node hare = head;
        Node turtle = head;

        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public boolean palindrome(Node head){
        if(head == null || head.next ==null){ //video error
            return true;
        }
        Node middle = findMiddle(head); // 1st half end
        Node secondHalfStart = reverse(middle.next);

        Node firstHalfStart = head;
        while(firstHalfStart != null && secondHalfStart != null ){ // video error
            if(firstHalfStart.data != secondHalfStart.data){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;

        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeLL list1 = new PalindromeLL();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(2);
        list1.addLast(1);
        System.out.println("Test Case 1");
        System.out.print("Linked List: ");
        list1.printList();
        System.out.println("Is Palindrome: " + list1.palindrome(list1.head));
        System.out.println();

        // Test Case 2: Palindrome Linked List
        PalindromeLL list2 = new PalindromeLL();
        list2.addLast(1);
        list2.addLast(2);
        list2.addLast(3);
        list2.addLast(2);
        list2.addLast(1);
        System.out.println("Test Case 2");
        System.out.print("Linked List: ");
        list2.printList();
        System.out.println("Is Palindrome: " + list2.palindrome(list2.head));
        System.out.println();
        
        // Test Case 3: Non-Palindrome Linked List
        PalindromeLL list3 = new PalindromeLL();
        list3.addLast(1);
        list3.addLast(2);
        list3.addLast(3);
        list3.addLast(4);
        list3.addLast(5);
        System.out.println("Test Case 3");
        System.out.print("Linked List: ");
        list3.printList();
        System.out.println("Is Palindrome: " + list3.palindrome(list3.head));
        System.out.println();
        
        // Test Case 4: Single Node Linked List
        PalindromeLL list4 = new PalindromeLL();
        list4.addLast(1);
        System.out.println("Test Case 4");
        System.out.print("Linked List: ");
        list4.printList();
        System.out.println("Is Palindrome: " + list4.palindrome(list4.head));
        System.out.println();
    }
    
}
=======
public class PalindromeLL {
    Node head;
    
    class Node{
        int data;
        Node next;
        
        Node(int data){this.data = data; this.next = null;} 
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
            System.out.print(currNode.data +" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
        
    }
    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;

        while(curr != null)
        {
            Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
    public Node findMiddle(Node head){
        Node hare = head;
        Node turtle = head;

        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public boolean palindrome(Node head){
        if(head == null || head.next ==null){ //video error
            return true;
        }
        Node middle = findMiddle(head); // 1st half end
        Node secondHalfStart = reverse(middle.next);

        Node firstHalfStart = head;
        while(firstHalfStart != null && secondHalfStart != null ){ // video error
            if(firstHalfStart.data != secondHalfStart.data){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;

        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeLL list1 = new PalindromeLL();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(2);
        list1.addLast(1);
        System.out.println("Test Case 1");
        System.out.print("Linked List: ");
        list1.printList();
        System.out.println("Is Palindrome: " + list1.palindrome(list1.head));
        System.out.println();

        // Test Case 2: Palindrome Linked List
        PalindromeLL list2 = new PalindromeLL();
        list2.addLast(1);
        list2.addLast(2);
        list2.addLast(3);
        list2.addLast(2);
        list2.addLast(1);
        System.out.println("Test Case 2");
        System.out.print("Linked List: ");
        list2.printList();
        System.out.println("Is Palindrome: " + list2.palindrome(list2.head));
        System.out.println();
        
        // Test Case 3: Non-Palindrome Linked List
        PalindromeLL list3 = new PalindromeLL();
        list3.addLast(1);
        list3.addLast(2);
        list3.addLast(3);
        list3.addLast(4);
        list3.addLast(5);
        System.out.println("Test Case 3");
        System.out.print("Linked List: ");
        list3.printList();
        System.out.println("Is Palindrome: " + list3.palindrome(list3.head));
        System.out.println();
        
        // Test Case 4: Single Node Linked List
        PalindromeLL list4 = new PalindromeLL();
        list4.addLast(1);
        System.out.println("Test Case 4");
        System.out.print("Linked List: ");
        list4.printList();
        System.out.println("Is Palindrome: " + list4.palindrome(list4.head));
        System.out.println();
    }
    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
