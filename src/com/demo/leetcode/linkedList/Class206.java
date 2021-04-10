package com.demo.leetcode.linkedList;

public class Class206 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        // 递归法
        return recursive(head, head.next);
    }

    // 递归法
    public ListNode recursive(ListNode pre, ListNode cur) {
        if (cur == null) return pre;
        ListNode next = cur.next;
        cur.next = pre;
        return recursive(cur, next);
    }

    // 迭代法
    public ListNode foreach(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

}
