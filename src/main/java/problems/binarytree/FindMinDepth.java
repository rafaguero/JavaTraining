package problems.binarytree;

public class FindMinDepth {
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}
public class BinaryTree{
    Node root;
    int minDepth(){
        return minDepth(root);
    }
    int minDepth(Node root){
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        if (root.left == null){
            return minDepth(root.right) + 1;
        }
        if (root.right == null){
            return minDepth(root.left)+1;
        }
        return Math.min(minDepth(root.left),minDepth(root.right)) + 1;
    }

}
    public void testBinaryTree(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("the min depth of tree is " + tree.minDepth());
    }

    public static void main(String[] args) {
        FindMinDepth findMinDepth = new FindMinDepth();
        findMinDepth.testBinaryTree();



    }
}
