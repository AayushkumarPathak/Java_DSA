public class DetectCycle {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public Node head;

    public void printLL() {
        Node curr = head;
        if (head == null) {
            System.out.println("Empty.");
            return;
        }
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }

    }

    public boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DetectCycle detectCycle = new DetectCycle();

        detectCycle.head = detectCycle.new Node(1);
        detectCycle.head.next = detectCycle.new Node(2);
        detectCycle.head.next.next = detectCycle.new Node(3);
        detectCycle.head.next.next.next = detectCycle.head;

        boolean ans = detectCycle.isCycle();
        System.out.println(ans);

    }

}
