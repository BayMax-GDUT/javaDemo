package com.demo.leetcode.package2;

public class ListNode {
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
