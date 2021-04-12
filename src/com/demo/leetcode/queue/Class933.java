package com.demo.leetcode.queue;


public class Class933 {

    class RecentCounter {

        // 因为每次新放入的数都会比之前的大，因此查询的范围可以缩减为从上一次符合要求的地方开始，因此可以把root一直往后移动
        // 通过一直往前移动root的方法，耗费时间从1540ms缩少到23ms
        ListNode root;
        ListNode current;
        int count = 0;

        public RecentCounter() {
            root = null;
            current = null;
            count = 0;
        }

        public int ping ( int t) {
            count++;
            if (root == null) {
                root = new ListNode(t);
                current = root;
                return 1;
            } else {
                current.next = new ListNode(t);
                current = current.next;
                int requiredNum = current.val - 3000;
                int notRequiredCount = 0;
                while (root.val < requiredNum) {
                    root = root.next;
                    count--;
                    notRequiredCount++;
                }
                return count - notRequiredCount;
            }
        }

        class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }
    }



}
