package com.demo.leetcode.linkedList;

import org.junit.Test;

public class Class203 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode root = new ListNode(0, head);
        ListNode current = root;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                // 需确保更改后的next同样不符合要求才可以移动current
                current = current.next;
            }

        }
        return root.next;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
