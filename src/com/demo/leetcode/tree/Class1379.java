package com.demo.leetcode.tree;

public class Class1379 {

    // 初阶（所有节点不含重复值）
//    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
//        if (cloned == null) return null;
//        if (cloned.val == target.val) return cloned;
//        TreeNode left = getTargetCopy(original, cloned.left, target);
//        if (left != null) return left;
//        return getTargetCopy(original, cloned.right, target);
//    }

    // 进阶（节点可能有重复值）
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) return null;
        if (original == target) return cloned;
        TreeNode left = getTargetCopy(original.left, cloned.left, target);
        if (left != null) return left;
        return getTargetCopy(original.right, cloned.right, target);
    }
}
