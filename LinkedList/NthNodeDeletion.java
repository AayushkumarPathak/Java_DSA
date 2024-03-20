<<<<<<< HEAD
import java.util.LinkedList;

public class NthNodeDeletion {
    Node head;
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node removeNthFrom(Node data,int n){
        if(head == null){
            return null;
        }
        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        int idx = size - n;
        int i = 0;
        Node prev = head;
        while( i< idx){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;

    }
    

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        NthNodeDeletion l = new NthNodeDeletion();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        System.out.println(list);
        l.removeNthFrom(l.head,0);

        System.out.println(list);
        
    }
    
}
=======
import java.util.LinkedList;

public class NthNodeDeletion {
    Node head;
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // public Node removeNthFrom(Node data,int n){
    //     if(head == null){
    //         return null;
    //     }
    //     int size = 0;
    //     Node curr = head;
    //     while(curr != null){
    //         curr = curr.next;
    //         size++;
    //     }
    //     int idx = size - n;
    //     int i = 0;
    //     Node prev = head;
    //     while( i< idx){
    //         prev = prev.next;
    //         i++;
    //     }
    //     prev.next = prev.next.next;
    //     return head;

    // }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // NthNodeDeletion l = new NthNodeDeletion();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        System.out.println(list);
        // l.removeNthFrom(l.head,0);
        System.out.println(list);
        
    }
    
}
>>>>>>> 3d252e668d782d679b3f6ca29f7ef2456389e2cb
