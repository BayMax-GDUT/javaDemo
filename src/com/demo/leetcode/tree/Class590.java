package com.demo.leetcode.tree;

import org.junit.Test;

import java.util.*;

public class Class590 {

    List<Integer> result = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        // 递归解法
        // recursive(root);
        // 迭代解法未实现
        return result;
    }

    public void recursive (Node root) {
        if (root == null) return;
        root.children.forEach(node -> {
            recursive(node);
        });
        result.add(root.val);
    }

}
