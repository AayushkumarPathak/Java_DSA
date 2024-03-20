import java.util.*;

public class Odd_EvenLevels {
    // Java Program for the above approach

    // Tree node
    static class Node {
        int val;
        Node left, right;
    }

    // Function to return new tree node
    static Node newNode(int data) {
        Node temp = new Node();
        temp.val = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    // Function to check if the
    // tree is even-odd tree
    public static boolean isEvenOddBinaryTree(Node root) {
        if (root == null)
            return true;

        // Stores nodes of each level
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        // Store the current level
        // of the binary tree
        int level = 0;

        // Traverse until the
        // queue is empty
        while (!q.isEmpty()) {

            // Stores the number of nodes
            // present in the current level
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node node = q.poll();

                // Check if the level
                // is even or odd
                if (level % 2 == 0) {

                    if (node.val % 2 == 1)
                        return false;
                } else if (level % 2 == 1) {

                    if (node.val % 2 == 0)
                        return false;
                }

                // Add the nodes of the next
                // level into the queue
                if (node.left != null) {

                    q.add(node.left);
                }
                if (node.right != null) {

                    q.add(node.right);
                }
            }

            // Increment the level count
            level++;
        }

        return true;
    }

    // Driver Code
    public static void main(String[] args) {

        // Construct a Binary Tree
        Node root = null;
        root = newNode(2);
        root.left = newNode(3);
        root.right = newNode(9);
        root.left.left = newNode(4);
        root.left.right = newNode(10);
        root.right.right = newNode(6);

        // Check if the binary tree
        // is even-odd tree or not
        if (isEvenOddBinaryTree(root)) {

            System.out.println("YES");
        } else {

            System.out.println("NO");
        }
    }
}
