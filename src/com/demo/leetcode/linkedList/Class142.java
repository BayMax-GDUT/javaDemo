package com.demo.leetcode.linkedList;

import java.util.HashSet;
import java.util.Set;

public class Class142 {

    /**
     * 快慢指针
     */
//    public ListNode detectCycle(ListNode head) {
//        ListNode fast = head;
//        ListNode slow = head;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//            if (fast == slow) {
//                fast = head;
//                while (fast != slow) {
//                    fast = fast.next;
//                    slow = slow.next;
//                }
//                return slow;
//            }
//        }
//        return null;
//    }

    /**
     * 哈希集合
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if (set.contains(current)) {
                return current;
            }
            set.add(current);
            current = current.next;
        }
        return null;
    }



}
