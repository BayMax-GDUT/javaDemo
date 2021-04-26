package com.demo.leetcode.tree;

import com.demo.dataStructure.tree.Tree;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class Class897 {

    /**
     * 递归将节点放入队列，根据队列顺序重新接起来
     */
//    public TreeNode increasingBST(TreeNode root) {
//        if (root == null) return null;
//        Queue<TreeNode> queue = new LinkedList();
//        recursive(root, queue);
//        TreeNode result = queue.poll();
//        TreeNode current = result;
//        while (!queue.isEmpty()) {
//            current.right = queue.poll();
//            current.left = null;
//            current = current.right;
//        }
//        return result;
//    }
//
//    public void recursive(TreeNode node, Queue<TreeNode> queue) {
//        if (node != null) {
//            recursive(node.left, queue);
//            //
//            queue.add(node);
//            recursive(node.right, queue);
//        }
//    }

    /**
     * 在方法外定义一个节点，递归将所有节点接到该节点后面
     */
    TreeNode head;
    TreeNode current;
    public TreeNode increasingBST(TreeNode root) {
        if (root == null) return null;
        increasingBST(root.left);
        if (head == null) {
            head = root;
            current = head;
            head.left = null;
        } else {
            current.right = root;
            current.left = null;
            current = current.right;
        }
        increasingBST(root.right);
        return head;
    }

}
