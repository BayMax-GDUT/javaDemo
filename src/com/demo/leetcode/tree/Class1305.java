package com.demo.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Class1305 {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        recursive(root1, queue1);
        recursive(root2, queue2);
        List<Integer> result = new ArrayList<>();
        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            if (queue2.isEmpty()) {
                result.add(queue1.poll());
            } else if (queue1.isEmpty()) {
                result.add(queue2.poll());
            } else if (queue1.peek() >= queue2.peek()) {
                result.add(queue2.poll());
            } else if (queue1.peek() <= queue2.peek()) {
                result.add(queue1.poll());
            }
        }
        return result;
    }

    public void recursive(TreeNode node, Queue<Integer> queue) {
        if (node == null) return;
        recursive(node.left, queue);
        queue.add(node.val);
        recursive(node.right, queue);
    }

}
