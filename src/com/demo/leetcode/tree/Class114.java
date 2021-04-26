package com.demo.leetcode.tree;

public class Class114 {

    /**
     * 先保存一份right，最后先将左节点变成右节点，然后在右节点的最后一个后面接上保存的right
     */
    TreeNode right;
    public void flatten(TreeNode root) {
        if (root == null) return;
        right = root.right;
        flatten(root.left);
        flatten(root.right);
        root.right = root.left;
        root.left = null;
        while (root.right != null) root = root.right;
        root.right = right;
    }
}
