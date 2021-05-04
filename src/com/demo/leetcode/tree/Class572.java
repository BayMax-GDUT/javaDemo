package com.demo.leetcode.tree;

public class Class572 {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null || subRoot == null) return false;
        if (root.val == subRoot.val) {
            return recursive1(root, subRoot) || (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot));
        } else {
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    }

    public boolean recursive1 (TreeNode node1, TreeNode node2) {
        if (node1 == node2 && node1 == null) return true;
        if (node1 == null || node2 == null) return false;
        return node1.val == node2.val && (recursive1(node1.left, node2.left) && recursive1(node1.right, node2.right));
    }

}
