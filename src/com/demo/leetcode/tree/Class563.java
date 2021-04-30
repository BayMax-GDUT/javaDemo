package com.demo.leetcode.tree;

import org.junit.Test;

public class Class563 {

    int sum = 0;
    public int findTilt(TreeNode root) {
        recursive(root);
        return sum;
    }

    public int recursive (TreeNode node) {
        if (node == null) return 0;
        int left = recursive(node.left);
        int right = recursive(node.right);
        sum += Math.abs(right - left);
        return left + right + node.val;
    }

}
