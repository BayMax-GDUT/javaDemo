package com.demo.leetcode.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JianZhi54 {

    List<Integer> list = new ArrayList<>();
    public int kthLargest(TreeNode root, int k) {
        recursive(root, k);
        return list.get(list.size() - 1);
    }

    public void recursive(TreeNode node, int k) {
        if (node == null) return;
        recursive(node.right, k);
        if (list.size() != k) {
            list.add(node.val);
        } else {
            return;
        }
        recursive(node.left, k);
    }

    @Test
    public void test() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        kthLargest(root, 1);
    }
}
