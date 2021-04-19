package com.demo.leetcode.linkedList;

import javax.crypto.Cipher;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

/**
 * 深拷贝一个单向链表
 * 链表的每个节点除了next外还有一个rand节点指向链表里随机一个节点
 */
public class NodeWithRandNode {

    class Node {
        int val;
        Node next;
        Node rand;
        public Node(int val) {
            this.val = val;
        }
        private Node() {}
    }

    public Node deepClone(Node root) {
        if (root == null) return null;
        Node curr = root;
        Map<Node, Node> map = new HashMap();
        // 先将所有节点复制一次，用旧节点作为key关联作为value的新节点
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        curr = root;
        // 迭代一次旧链表，完成关联关系
        while (curr != null) {
            map.get(curr).next = map.get(curr.next);
            map.get(curr).rand = map.get(curr.rand);
            curr = curr.next;
        }
        return map.get(root);
    }
}
