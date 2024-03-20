public class PalindromeLLOpt {
    Node head;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;

        
    }

    public void printLL() {
        Node curr = head;
        if(head == null){
            System.out.println("Empty");
            return;
        }
        while(curr!=null){
            System.out.print(curr.val+"->");
            curr = curr.next;
        }
        System.out.print("null\n");

    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node midNode = findMid(head);

        // step1 reverse
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // step2
        Node right = prev;
        Node left = head;

        // step3
        while (right != null) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public static void main(String[] args) {
        PalindromeLLOpt ll = new PalindromeLLOpt();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.printLL();       // 1->2->2->1
        System.out.println(ll.isPalindrome());

        
    }

}
