<<<<<<< HEAD
public class HareTurtleAlgo {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode findSecondMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // Handle case of empty or single-node linked list
        }

        ListNode turtle = head;
        ListNode hare = head;

        while (hare != null && hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }

        ListNode secondMiddle = turtle.next;

        return secondMiddle;
    }

    public static void main(String[] args) {
        HareTurtleAlgo linkedList = new HareTurtleAlgo(); // Create an instance of HareTurtleAlgo

        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = linkedList.new ListNode(1);
        head.next = linkedList.new ListNode(2);
        head.next.next = linkedList.new ListNode(3);
        head.next.next.next = linkedList.new ListNode(4);
        // head.next.next.next.next = linkedList.new ListNode(5);

        ListNode secondMiddle = linkedList.findSecondMiddle(head);

        if (secondMiddle != null) {
            System.out.println("Second Middle Node: " + secondMiddle.val);
        } else {
            System.out.println("No second middle node found.");
        }
    }
}
=======
public class HareTurtleAlgo {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode findSecondMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null; // Handle case of empty or single-node linked list
        }

        ListNode turtle = head;
        ListNode hare = head;

        while (hare != null && hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }

        ListNode secondMiddle = turtle.next;

        return secondMiddle;
    }

    public static void main(String[] args) {
        HareTurtleAlgo linkedList = new HareTurtleAlgo(); // Create an instance of HareTurtleAlgo

        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = linkedList.new ListNode(1);
        head.next = linkedList.new ListNode(2);
        head.next.next = linkedList.new ListNode(3);
        head.next.next.next = linkedList.new ListNode(4);
        // head.next.next.next.next = linkedList.new ListNode(5);

        ListNode secondMiddle = linkedList.findSecondMiddle(head);

        if (secondMiddle != null) {
            System.out.println("Second Middle Node: " + secondMiddle.val);
        } else {
            System.out.println("No second middle node found.");
        }
    }
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
