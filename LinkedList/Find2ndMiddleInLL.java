<<<<<<< HEAD


public class Find2ndMiddleInLL {
    ListNode head;
    class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insert(int data){ //add Last
            
            ListNode newNode = new ListNode(data);

            if(head == null){
                head = newNode;
                return;
            }
            ListNode currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
                
            }
            currNode.next = newNode;
        }

        public void printLL(){
            if(head == null){
                System.out.println("LinkedList is Empty!");
                return;
            }
            ListNode currNode = head;
            while(currNode != null){
                System.out.print(currNode.data+" -> ");
                currNode = currNode.next;
            }
            System.out.println("Null");
        }


        public ListNode findMiddle(ListNode head){
            if(head == null || head.next == null){
                return null;
            }
            ListNode turtle = head;
            ListNode hare = head;
            while(hare != null && hare.next != null && hare.next.next != null){
                hare = hare.next.next;
                turtle = turtle.next;
            }
            ListNode secMid = turtle.next;
            return secMid;
        }
        /*--driver code-- */
        public static void main(String[] args) {
            Find2ndMiddleInLL ll = new Find2ndMiddleInLL();
            System.out.println("Test Case 1");
            ll.insert(1);
            ll.insert(2);
            ll.insert(3);
            ll.insert(4);
            ll.insert(5);

            ll.printLL();
            ListNode secondMiddle = ll.findMiddle(ll.head);

        if (secondMiddle != null) {
            System.out.println("Second Middle Node: " + secondMiddle.data);
        } else {
            System.out.println("No second middle node found, Since Linked List is empty!.");
        }

        System.out.println("2nd Test Case");
        Find2ndMiddleInLL ll2 = new Find2ndMiddleInLL();
        ll2.insert(11);
        ll2.insert(14);
        ll2.insert(16);
        ll2.insert(17);
        ll2.insert(18);
        ll2.insert(19);
        ll2.insert(20);
        ll2.printLL();
        ListNode sec2 = ll2.findMiddle(ll2.head);

        if(sec2 != null){
            System.out.println("SecondMiddle Node:"+sec2.data);
        }else{
            System.out.println("No secondMiddle Node found Since linked list is empty.");
        }
            
    }
    
}
=======


public class Find2ndMiddleInLL {
    ListNode head;
    class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insert(int data){ //add Last
            
            ListNode newNode = new ListNode(data);

            if(head == null){
                head = newNode;
                return;
            }
            ListNode currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
                
            }
            currNode.next = newNode;
        }

        public void printLL(){
            if(head == null){
                System.out.println("LinkedList is Empty!");
                return;
            }
            ListNode currNode = head;
            while(currNode != null){
                System.out.print(currNode.data+" -> ");
                currNode = currNode.next;
            }
            System.out.println("Null");
        }


        public ListNode findMiddle(ListNode head){
            if(head == null || head.next == null){
                return null;
            }
            ListNode turtle = head;
            ListNode hare = head;
            while(hare != null && hare.next != null && hare.next.next != null){
                hare = hare.next.next;
                turtle = turtle.next;
            }
            ListNode secMid = turtle.next;
            return secMid;
        }
        /*--driver code-- */
        public static void main(String[] args) {
            Find2ndMiddleInLL ll = new Find2ndMiddleInLL();
            System.out.println("Test Case 1");
            ll.insert(1);
            ll.insert(2);
            ll.insert(3);
            ll.insert(4);
            ll.insert(5);

            ll.printLL();
            ListNode secondMiddle = ll.findMiddle(ll.head);

        if (secondMiddle != null) {
            System.out.println("Second Middle Node: " + secondMiddle.data);
        } else {
            System.out.println("No second middle node found, Since Linked List is empty!.");
        }

        System.out.println("2nd Test Case");
        Find2ndMiddleInLL ll2 = new Find2ndMiddleInLL();
        ll2.insert(11);
        ll2.insert(14);
        ll2.insert(16);
        ll2.insert(17);
        ll2.insert(18);
        ll2.insert(19);
        ll2.insert(20);
        ll2.printLL();
        ListNode sec2 = ll2.findMiddle(ll2.head);

        if(sec2 != null){
            System.out.println("SecondMiddle Node:"+sec2.data);
        }else{
            System.out.println("No secondMiddle Node found Since linked list is empty.");
        }
            
    }
    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
