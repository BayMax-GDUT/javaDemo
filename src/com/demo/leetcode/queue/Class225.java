package com.demo.leetcode.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Class225 {

    class MyStack {

        private Queue<Integer> inputQueue;
        private Queue<Integer> tempQueue;
        private int count;

        /** Initialize your data structure here. */
        public MyStack() {
            inputQueue = new LinkedList<Integer>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            inputQueue.offer(x);
            count++;
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            tempQueue = new LinkedList<Integer>();
            // count - 1，有一个元素是remove掉的
            for (int i = 0; i < count - 1; i++) {
                tempQueue.offer(inputQueue.poll());
            }
            Integer result = inputQueue.peek();
            inputQueue = tempQueue;
            count--;
            return result == null ? 0 : result.intValue();
        }

        /** Get the top element. */
        public int top() {
            tempQueue = new LinkedList<Integer>();
            for (int i = 0; i < count - 1; i++) {
                tempQueue.offer(inputQueue.poll());
            }
            Integer result = inputQueue.peek();
            tempQueue.offer(inputQueue.poll());
            inputQueue = tempQueue;
            return result;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return count == 0;
        }
    }

}
