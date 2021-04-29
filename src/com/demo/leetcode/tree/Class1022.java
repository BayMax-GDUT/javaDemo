package com.demo.leetcode.tree;

import org.junit.Test;

public class Class1022 {

    public int sumRootToLeaf(TreeNode root) {
        return recursive(root, 0);
    }

    public int recursive(TreeNode node, int sum) {
        if (node == null) return 0;
        sum = 2 * sum + node.val;
        if (node.left == null && node.right == null) {
            return sum;
        }
        return recursive(node.left, sum) + recursive(node.right, sum);
    }

    /**
     * 平安寿险面试题
     * 将一个树从根节点到叶子节点组成一个数，求整个树所有数的总和
     * 如根节点为1，左节点为2，右节点为3，则12 + 13 = 25
     */
    public int sumNode (TreeNode root) {
        return recursive1(root, 0);
    }

    public int recursive1 (TreeNode node, int sum) {
        if (node == null) return 0;
        sum = 10 * sum + node.val;
        if (node.left == null && node.right == null) {
            return sum;
        }
        return recursive1(node.left, sum) + recursive1(node.right, sum);
    }

    @Test
    public void test () {
        TreeNode node = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(sumNode(node));
    }

}
