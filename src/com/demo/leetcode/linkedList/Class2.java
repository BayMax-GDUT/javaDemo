package com.demo.leetcode.linkedList;

public class Class2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode head = new ListNode(0);
        ListNode current = head;
        int carry = 0;
        while(p != null || q != null){
            //获取当前节点的值
            int add1 = (p == null)? 0 : p.val;
            int add2 = (q == null)? 0 : q.val;

            int sum = carry + add1 + add2;
            carry = sum / 10;

            //生成新的节点
            current.next = new ListNode(sum % 10);
            current = current.next;

            if(p != null)p = p.next;
            if(q != null)q = q.next;

        }
        if(carry != 0){
            current.next = new ListNode(carry);
        }
        return head.next;
    }

    class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) {this.val = x;}

        @Override
        public String toString(){
            ListNode listNode = this;
            String str = "";
            while (listNode != null){
                str += listNode.val;
                listNode = listNode.next;
            }
            return new StringBuffer(str).reverse().toString();
        }
    }
}
