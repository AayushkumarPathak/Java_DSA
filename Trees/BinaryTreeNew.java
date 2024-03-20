import java.util.Scanner;

public class BinaryTreeNew {
    Scanner sc = new Scanner(System.in);
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public Node buildTree(Node root){
        
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
    public void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }


    public static void main(String[] args) {
        BinaryTreeNew bt = new BinaryTreeNew();
        Node root = null;
        bt.buildTree(root);
        bt.preOrder(root);

        
    }
    
}
