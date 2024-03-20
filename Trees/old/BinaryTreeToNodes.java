public class BinaryTreeToNodes {
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    class BinaryTree{
        Node root;

        BinaryTree(){
            this.root = null;
        }

        public Node buildTree(int data){
            if(root == null){
                root = new Node(data);
                return root;
            }
            root.left = buildTree(data);
            root.right = buildTree(data);

            return root;
        }

    }
    
}
