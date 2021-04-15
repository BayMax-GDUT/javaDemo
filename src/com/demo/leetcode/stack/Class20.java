package com.demo.leetcode.stack;

import java.util.Stack;

public class Class20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == ')' || currentChar == ']' || currentChar == '}') {
                if (!stack.empty()) {
                    char peek = stack.peek();
                    if ((peek == '(' && currentChar == ')') ||
                            (peek == '[' && currentChar == ']') ||
                            (peek == '{') && currentChar == '}') {
                        stack.pop();
                        continue;
                    }
                }
                return false;
            } else {
                stack.push(currentChar);
            }
        }
        return stack.empty();
    }
}
