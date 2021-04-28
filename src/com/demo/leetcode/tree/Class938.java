package com.demo.leetcode.tree;

public class Class938 {

    int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        if (root.val < high) {
            rangeSumBST(root.right, low, high);
        }
        if (root.val > low) {
            rangeSumBST(root.left, low, high);
        }
        return sum;
    }

}
