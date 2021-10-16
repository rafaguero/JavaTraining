package problems.tree;

import bean.TreeNode;

public class FinAllUniv {

    private static int findAllUniv(TreeNode node){

        int counter = 0;
        if (node.getLeft() == null && node.getRight() == null){
            return counter;
        }
        if ( node.getData() == node.getLeft().getData() && node.getData() == node.getRight().getData()){
            counter++;
        }
        return findAllUniv(node.getLeft()) + findAllUniv(node.getRight()) + counter;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode treeNode2 = new TreeNode(0);
        TreeNode treeNode3 = new TreeNode(0);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(0);
        TreeNode treeNode6 = new TreeNode(1);
        TreeNode treeNode7 = new TreeNode(1);
        TreeNode treeNode8 = new TreeNode(0);
        TreeNode treeNode9 = new TreeNode(0);
        root.setLeft(treeNode2);
        root.setRight(treeNode3);
        treeNode3.setLeft(treeNode4);
        treeNode3.setRight(treeNode5);
        treeNode4.setLeft(treeNode6);
        treeNode4.setRight(treeNode7);
        treeNode5.setLeft(treeNode8);
        treeNode5.setRight(treeNode9);
        System.out.println(findAllUniv(root));
    }
}
