package com.demo.leetcode.tree;

public class Class173 {

    class BSTIterator {

        ListNode node = new ListNode(Integer.MIN_VALUE);
        ListNode current = node;
        public BSTIterator(TreeNode root) {
            recursive(root);
        }

        private void recursive(TreeNode treeNode) {
            if (treeNode == null) return;
            recursive(treeNode.left);
            ListNode temp = new ListNode(treeNode.val);
            current.next = temp;
            current = current.next;
            recursive(treeNode.right);
        }

        public int next() {
            if (node.next != null) {
                int result = node.next.val;
                node = node.next;
                return result;
            }
            return 0;
        }

        public boolean hasNext() {
            return node.next != null;
        }
    }

}
