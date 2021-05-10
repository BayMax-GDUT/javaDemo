package com.demo.leetcode.tree;

public class Class222 {

    // 二叉树深度
    int height = 0;
    int count = 0;
    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        TreeNode temp = root;
        while (temp.left != null) {
            height++;
            temp = temp.left;
        }
        if (height > 0) {
            for (int i = 0; i <= height; i++) {
                count += Math.pow(2, i);
            }
            recursive(root, 0);
            return count;
        } else {
            return 1;
        }
    }

    /*如果找到了有数值的节点*/
    public void recursive(TreeNode node, int height) {
        if (height < this.height - 1) {
            recursive(node.right, height + 1);
            recursive(node.left, height + 1);
        } else {
            if (node.right == null) {
                count--;
            }
            if (node.left == null) {
                count--;
            }
        }
    }

}
