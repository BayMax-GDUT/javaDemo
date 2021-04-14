package com.demo.leetcode.queue;

public class Class641 {

    class MyCircularDeque {

        private int[] data;
        private int head;
        private int tail;

        /** Initialize your data structure here. Set the size of the deque to be k. */
        public MyCircularDeque(int k) {
            data = new int[k];
            for (int i = 0; i < data.length; i++) {
                data[i] = -1;
            }
        }

        /** Adds an item at the front of Deque. Return true if the operation is successful. */
        public boolean insertFront(int value) {
            if (isFull()) {
                return false;
            } else if (isEmpty()) {
                data[head] = value;
                return true;
            } else {
                if (--head < 0) head = data.length - 1;
                data[head] = value;
                return true;
            }
        }

        /** Adds an item at the rear of Deque. Return true if the operation is successful. */
        public boolean insertLast(int value) {
            if (isFull()) {
                return false;
            } else if (isEmpty()) {
                data[tail] = value;
                return true;
            } else {
                if (++tail == data.length) tail = 0;
                data[tail] = value;
                return true;
            }
        }

        /** Deletes an item from the front of Deque. Return true if the operation is successful. */
        public boolean deleteFront() {
            if (isEmpty()) return false;
            // 不止一个数据 需要移动指针
            if (head != tail || data[head] == -1) {
                data[head++] = -1;
                if (head == data.length) head = 0;
            } else {
                // 只有一个数据，删除后不需要移动指针
                data[head] = -1;
            }
            return true;
        }

        /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
        public boolean deleteLast() {
            if (isEmpty()) return false;
            if (head != tail || data[tail] == -1) {
                data[tail] = -1;
                if (--tail < 0) tail = data.length - 1;
            } else {
                data[tail] = -1;
            }
            return true;
        }

        /** Get the front item from the deque. */
        public int getFront() {
            return data[head];
        }

        /** Get the last item from the deque. */
        public int getRear() {
            return data[tail];
        }

        /** Checks whether the circular deque is empty or not. */
        public boolean isEmpty() {
            return head == tail && data[head] == -1;
        }

        /** Checks whether the circular deque is full or not. */
        public boolean isFull() {
            return tail - head == data.length - 1 || tail - head == -1;
        }
    }
}
