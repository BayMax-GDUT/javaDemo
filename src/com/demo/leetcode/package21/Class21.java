package com.demo.leetcode.package21;

import org.junit.Test;

public class Class21 {

    @Test
    public void mergeTwoLists() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(5)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(6)));
        ListNode root = new ListNode(0);
        ListNode current = root;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                current.next = l2;
                current = current.next;
                l2 = l2.next;
            } else {
                current.next = l1;
                current = current.next;
                l1 = l1.next;
            }
        }
        if (l1 == null) {
            current.next = l2;
        } else {
            current.next = l1;
        }
        current = root.next;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
