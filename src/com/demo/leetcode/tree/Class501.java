package com.demo.leetcode.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Class501 {

    int preVal, currTimes, maxTimes;
    List<Integer> list = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        recursive(root);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public void recursive (TreeNode node) {
        if (node == null) return;
        recursive(node.left);
        if (preVal == node.val) {
            currTimes++;
        } else {
            preVal = node.val;
            currTimes = 1;
        }
        if (currTimes == maxTimes) {
            list.add(node.val);
        } else if (currTimes > maxTimes) {
            list.clear();
            list.add(node.val);
            maxTimes = currTimes;
        }
        recursive(node.right);
    }
}
