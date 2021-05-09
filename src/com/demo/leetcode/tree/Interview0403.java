package com.demo.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Interview0403 {

    public ListNode[] listOfDepth(TreeNode tree) {
        if (tree == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tree);
        List<ListNode> nodeList = new ArrayList<>();
        while (!queue.isEmpty()) {
            int length = queue.size();
            ListNode root = null;
            ListNode current = null;
            for (int i = 0; i < length; i++) {
                TreeNode treeNodeTemp = queue.poll();
                if (treeNodeTemp.left != null) { queue.add(treeNodeTemp.left); }
                if (treeNodeTemp.right != null) { queue.add(treeNodeTemp.right); }
                ListNode listNodeTemp = new ListNode(treeNodeTemp.val);
                if (i == 0) {
                    root = listNodeTemp;
                    current = listNodeTemp;
                } else {
                    current.next = listNodeTemp;
                    current = current.next;
                }
            }
            nodeList.add(root);
        }
        ListNode[] result = new ListNode[nodeList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = nodeList.get(i);
        }
        return result;
    }

}
