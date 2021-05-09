package com.demo.leetcode.tree;

public class Class1315 {

    int sum = 0;
    public int sumEvenGrandparent(TreeNode root) {
        recursive(root);
        return sum;
    }

    public void recursive(TreeNode node) {
        if (node == null) return;
        if (node.val % 2 == 0) {
            if (node.left != null) {
                if (node.left.left != null) {
                    sum += node.left.left.val;
                }
                if (node.left.right != null) {
                    sum += node.left.right.val;
                }
            }
            if (node.right != null) {
                if (node.right.left != null) {
                    sum += node.right.left.val;
                }
                if (node.right.right != null) {
                    sum += node.right.right.val;
                }
            }
        }
        recursive(node.left);
        recursive(node.right);
    }

}
