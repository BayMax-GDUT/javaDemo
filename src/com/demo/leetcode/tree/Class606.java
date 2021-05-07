package com.demo.leetcode.tree;

public class Class606 {

    StringBuilder sb = new StringBuilder();
    public String tree2str(TreeNode root) {
        if (root == null) return "";
        recursive(root);
        return sb.toString();
    }

    public void recursive (TreeNode node) {
        if (node == null) return;
        sb.append(node.val);
        if (node.left != null || node.right != null) {
            sb.append("(");
            recursive(node.left);
            sb.append(")");
            if (node.right != null) {
                sb.append("(");
                recursive(node.right);
                sb.append(")");
            }
        }
    }

}
