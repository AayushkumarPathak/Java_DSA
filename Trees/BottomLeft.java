import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BottomLeft{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public Node buildTree(Node root){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data");
        int data = sc.nextInt();
        root = new Node(data);
        if(data == -1){
            return null;
        }

        System.out.print("Enter to insert at left of "+data+" :");
        root.left = buildTree(root.left);
        System.out.print("Enter to insert at right of "+data+" :");
        root.right = buildTree(root.right);
        return root;
    }
    public int find(Node root){
        Queue<Node> q = new LinkedList<>();
        int ans = -1;
        q.offer(root);
        while(!q.isEmpty()){
            Node node = q.poll();
            ans = node.data;
            if(node.right!=null){
                q.offer(node.right);
            }
            if(node.left!=null){
                q.offer(node.left);
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        BottomLeft b = new BottomLeft();
        Node root = null;
        root = b.buildTree(root);
    }
}