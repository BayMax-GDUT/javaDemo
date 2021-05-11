package com.demo.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class Class95 {


    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return null;
        return recursive(1, n);
    }

    public List<TreeNode> recursive(int start, int end) {
        List<TreeNode> result = new ArrayList<>();
        if (start > end) {
            result.add(null);
            return result;
        }
        for (int i = start; i < end + 1; i++) {
            List<TreeNode> left = recursive(start, i - 1);
            List<TreeNode> right = recursive(i + 1, end);
            for (TreeNode leftNode : left) {
                for (TreeNode rightNode : right) {
                    TreeNode temp = new TreeNode(i);
                    temp.left = leftNode;
                    temp.right = rightNode;
                    result.add(temp);
                }
            }
        }
        return result;
    }

}
