package com.demo.leetcode.queue;

public class Class622 {

    class MyCircularQueue {

        private int[] data;
        private int head;
        private int tail;

        public MyCircularQueue(int k) {
            data = new int[k];
            for (int i = 0; i < data.length; i++) {
                data[i] = -1;
            }
        }

        public boolean enQueue(int value) {
            if (isFull()) return false;
            if (isEmpty()) {
                // 如果为空，直接原地插入，不需要移动指针
                data[head] = value;
            } else {
                if (++tail == data.length) tail = 0;
                data[tail] = value;
            }
            return true;
        }

        public boolean deQueue() {
            if (isEmpty()) return false;
            data[head] = -1;
            // head与tail相等即只有一个元素，移除后不需要移动指针
            if (head != tail) head++;
            if (head == data.length) head = 0;
            return true;
        }

        public int Front() {
            if (isEmpty()) return -1;
            return data[head];
        }

        public int Rear() {
            if (isEmpty()) return -1;
            return data[tail];
        }

        public boolean isEmpty() {
            return head == tail && data[head] == -1;
        }

        public boolean isFull() {
            return (tail - head == data.length - 1 || tail - head == -1) && data[head] != -1;
        }
    }

}
