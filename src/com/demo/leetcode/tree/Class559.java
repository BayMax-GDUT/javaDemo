package com.demo.leetcode.tree;

public class Class559 {

    public int maxDepth(Node root) {
        if (root == null) return 0;
        if (root.children != null && root.children.size() > 0) {
            int max = 0;
            for (int i = 0; i < root.children.size(); i++) {
                max = Math.max(maxDepth(root.children.get(i)), max);
            }
            return max + 1;
        } else {
            return 1;
        }
    }

}
