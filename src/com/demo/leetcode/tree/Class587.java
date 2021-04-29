package com.demo.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class Class587 {

    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root == null) return list;
        // 递归解法
        recursive(root);
        // 迭代解法未实现
        return list;
    }

    public void recursive(Node node) {
        if (node == null) return;
        list.add(node.val);
        if (node.children != null && node.children.size() > 0) {
            for (int i = 0; i < node.children.size(); i++) {
                recursive(node.children.get(i));
            }
        }
    }

}
