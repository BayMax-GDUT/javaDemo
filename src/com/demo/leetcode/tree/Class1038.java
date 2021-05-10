package com.demo.leetcode.tree;

import com.demo.algorithm.Recursive;

import java.util.ArrayList;
import java.util.List;

public class Class1038 {

    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        if (root == null) return null;
        return recursive(root);
    }

    public TreeNode recursive(TreeNode node) {
        if (node == null) return null;
        TreeNode right = recursive(node.right);
        sum += node.val;
        TreeNode newNode = new TreeNode(sum);
        TreeNode left = recursive(node.left);
        newNode.left = left;
        newNode.right = right;
        return newNode;
    }

}
