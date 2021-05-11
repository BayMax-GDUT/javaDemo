package com.demo.leetcode.tree;

public class JianZhi68_2 {

    TreeNode result = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) return null;
        recursive(root, p, q);
        return result;
    }

    public boolean recursive (TreeNode node, TreeNode node1, TreeNode node2) {
        if (node == null || node1 == null || node2 == null) return false;
        boolean left = recursive(node.left, node1, node2) || node.val == node1.val || node.val == node2.val;
        boolean right = recursive(node.right, node1, node2) || node.val == node1.val || node.val == node2.val;
        if (left && right) result = node;
        return left || right;
    }

}
