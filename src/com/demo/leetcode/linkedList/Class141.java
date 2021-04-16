package com.demo.leetcode.linkedList;

import java.util.HashSet;
import java.util.Set;

public class Class141 {

    /**
     * 快慢指针
     */
//    public boolean hasCycle(ListNode head) {
//        if (head == null) return false;
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if (fast == slow) return true;
//        }
//        return false;
//    }

    /**
     * 哈希集合
     */
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if (set.contains(current)) {
                return true;
            }
            set.add(current);
            current = current.next;
        }
        return false;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
