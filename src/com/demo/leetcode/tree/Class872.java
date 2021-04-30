package com.demo.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Class872 {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        recursive(root1, queue1);
        recursive(root2, queue2);
        TreeNode temp1;
        TreeNode temp2;
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            temp1 = queue1.poll();
            temp2 = queue2.poll();
            if (temp1.val != temp2.val) {
                return false;
            }
        }
        return queue1.isEmpty() && queue2.isEmpty();
    }

    public void recursive(TreeNode node, Queue<TreeNode> queue) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            queue.add(node);
        } else {
            recursive(node.left, queue);
            recursive(node.right, queue);
        }
    }
}
