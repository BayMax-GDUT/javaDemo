package com.demo.leetcode.tree;

import java.util.*;

public class Class107 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> result = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() != 0) {
            int currentSize = queue.size();
            List<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < currentSize; i++) {
                TreeNode node = queue.poll();
                tempList.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            stack.add(tempList);
        }
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        return result;
    }

}
