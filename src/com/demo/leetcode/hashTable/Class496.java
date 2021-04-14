package com.demo.leetcode.hashTable;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Class496 {

    /**
     * 解题思路：
     * 将大数组迭代放入栈中，如果当前要放入的数小于栈顶数据则插入，大于则将栈顶数据与当前数据组成键值对放入hashmap
     * 将栈顶数据顶出，要放入的数继续与下一个栈顶数据比较，直到栈顶数据大于当前要放入的数
     * 迭代完成后，hashmap中储存了每个数的下一个比它大的数
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            while (!stack.empty() && stack.peek() < nums2[i]) {
                map.put(stack.peek(), nums2[i]);
                stack.pop();
            }
            stack.push(nums2[i]);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.getOrDefault(nums1[i], -1);
        }
        return result;
    }

}
