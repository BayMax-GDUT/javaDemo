package com.demo.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class Class894 {

    public List<TreeNode> allPossibleFBT(int n) {
        if (n % 2 == 0) return new ArrayList<>();
        List<TreeNode> result = new ArrayList<>();
        if (n == 1) {
            TreeNode newNode = new TreeNode(0);
            result.add(newNode);
        }
        for (int i = 1; i < n - 1; i += 2) {
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(n - i - 1);
            for (int j = 0; j < left.size(); j++) {
                for (int k = 0; k < right.size(); k++) {
                    TreeNode temp = new TreeNode(0);
                    temp.left = left.get(j);
                    temp.right = right.get(k);
                    result.add(temp);
                }
            }
        }
        return result;
    }

}
