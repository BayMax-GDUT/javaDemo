package com.demo.leetcode.stack;

import java.util.Stack;

public class Class232 {

    /**
     * 创建两个栈，一个输入栈一个输出栈
     * 输入的时候放到输入栈中
     * 输出的时候先判断输出栈中有无数据，如果有，则直接输出
     * 如果无数据，则将当前的输入栈中数据倒叙放到输出栈中
     * 输入栈与输出栈中的顺序是反过来的，两者各保存一部分的数据
     */
    class MyQueue {

        Stack<Integer> inputStack;
        Stack<Integer> outputStack;

        /** Initialize your data structure here. */
        public MyQueue() {
            inputStack = new Stack<>();
            outputStack = new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            inputStack.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if (outputStack.empty()) {
                while (!inputStack.empty()) {
                    outputStack.push(inputStack.pop());
                }
            }
            return outputStack.pop();
        }

        /** Get the front element. */
        public int peek() {
            if (outputStack.empty()) {
                while (!inputStack.empty()) {
                    outputStack.push(inputStack.pop());
                }
            }
            return outputStack.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return inputStack.empty() && outputStack.empty();
        }
    }

}
