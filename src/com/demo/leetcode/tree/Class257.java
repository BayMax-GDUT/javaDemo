package com.demo.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class Class257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        recursive(root, "", result);
        return result;
    }

    public void recursive(TreeNode node, String current, List<String> result) {
        if (node == null) return;
        current += node.val;
        if (node.left == null && node.right == null) {
            result.add(current);
        }
        recursive(node.left, current + "->", result);
        recursive(node.right, current + "->", result);
    }

}
