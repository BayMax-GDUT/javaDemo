package com.demo.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Class1302 {

    public int deepestLeavesSum(TreeNode root) {
        if (root == null) return 0;
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            int tempSum = 0;
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                tempSum += node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            sum = tempSum;
        }
        return sum;
    }

}
