package com.demo.leetcode.package155;

public class Class155 {
    class MinStack {
        private Node root;

        /** initialize your data structure here. */
        public MinStack() {

        }

        public void push(int val) {
            if (root == null) {
                root = new Node(val, val);
            } else {
                root = new Node(val, Math.min(val, root.min), root);
            }
        }

        public void pop() {
            root = root.next;
        }

        public int top() {
            return root.val;
        }

        public int getMin() {
            return root.min;
        }

        class Node {
            int val;
            int min;
            Node next;

            public Node (int val, int min) {
                this.val = val;
                this.min = min;
            }
            public Node (int val, int min, Node next) {
                this.val = val;
                this.min = min;
                this.next = next;
            }
        }
    }
}
