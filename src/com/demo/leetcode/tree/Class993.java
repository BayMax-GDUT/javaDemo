package com.demo.leetcode.tree;

public class Class993 {

    int parentX;
    int parentY;
    int levelX;
    int levelY;
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;
        recursive(root, 0, x, y, 0);
        return parentX != parentY && levelY == levelX;
    }

    public void recursive (TreeNode node, int dept, int x, int y, int parentVal) {
        if (node == null) return;
        if (node.val == x) {
            parentX = parentVal;
            levelX = dept + 1;
        } else if (node.val == y) {
            parentY = parentVal;
            levelY = dept + 1;
        } else {
            recursive(node.left, dept + 1, x, y, node.val);
            recursive(node.right, dept + 1, x, y, node.val);
        }
    }

}
