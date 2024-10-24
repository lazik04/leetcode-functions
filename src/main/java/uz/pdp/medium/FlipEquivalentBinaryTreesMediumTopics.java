package uz.pdp.medium;

import javax.swing.tree.TreeNode;

//951. Flip Equivalent Binary Trees
//Medium
//        Topics
//Companies
//For a binary tree T, we can define a flip operation as follows: choose any node, and swap the left and right child subtrees.
//
//A binary tree X is flip equivalent to a binary tree Y if and only if we can make X equal to Y after some number of flip operations.
//
//Given the roots of two binary trees root1 and root2, return true if the two trees are flip equivalent or false otherwise.
public class FlipEquivalentBinaryTreesMediumTopics {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {

        return checker(root1, root2);
    }

    private boolean checker(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null || node1.val != node2.val) {
            return false;
        }

        return (checker(node1.left, node2.left) || checker(node1.left, node2.right)) &&
                (checker(node1.right, node2.right) || checker(node1.right, node2.left));
    }
}

