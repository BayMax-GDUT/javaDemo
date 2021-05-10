package com.demo.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Class145 {

    List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return result;
        // 递归
        recursive(root);
        return result;
    }

    public void recursive(TreeNode node) {
        if (node == null) return;
        recursive(node.left);
        recursive(node.right);
        result.add(node.val);
    }

}
