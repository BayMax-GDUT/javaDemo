package com.demo.leetcode.queue;

import org.junit.Test;

public class Class622 {

    class MyCircularQueue {

        private int[] data;
        private int head = -1;
        private int tail = -1;

        public MyCircularQueue(int k) {
            data = new int[k];
            for (int i = 0; i < data.length; i++) {
                data[i] = -1;
            }
        }

        public boolean enQueue(int value) {
            if (isFull()) {
                return false;
            }
            ++tail;
            if (tail == data.length) tail = 0;
            data[tail] = value;
            if (head == -1) head = 0;
            return true;
        }

        public boolean deQueue() {
            if (isEmpty()) return false;
            data[head] = -1;
            head++;
            if (head == data.length) head = 0;
            return true;
        }

        public int Front() {
            if (isEmpty()) return -1;
            int result = data[head];
            return result;
        }

        public int Rear() {
            if (isEmpty()) return -1;
            int result = data[tail];
            return result;
        }

        public boolean isEmpty() {
            return tail == head && data[head] != -1;
        }

        public boolean isFull() {
            return tail - head == data.length - 1 || tail - head == -1;
        }
    }

}
