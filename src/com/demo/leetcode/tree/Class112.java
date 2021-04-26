package com.demo.leetcode.tree;

public class Class112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return recursive(root, targetSum, 0);
    }

    public boolean recursive(TreeNode node, int targetSum, int currentSum) {
        if (node.left == null && node.right == null) {
            return targetSum == currentSum + node.val;
        }
        // target不够大且还未到叶子节点，直接返回false
        if (targetSum < currentSum + node.val) return false;
        return recursive(node.left, targetSum, currentSum + node.val)
                || recursive(node.right, targetSum, currentSum + node.val);
    }

}
