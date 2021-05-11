package com.demo.leetcode.string;

import org.junit.Test;

import java.util.Stack;

public class Class848 {

    public String shiftingLetters(String s, int[] shifts) {
        if (s == null) return null;
        int sum = 0;
        String result = "";
        char[] chars = s.toCharArray();
        for (int i = shifts.length - 1; i >= 0; i--) {
            sum = (sum + shifts[i]) % 26;
            char tempChar = chars[i];
            char newChar = (char)('z' - tempChar >= sum ? tempChar + sum : 'a' + (sum - ('z' - tempChar + 1)));
            chars[i] = newChar;
        }
        return String.valueOf(chars);
    }

    @Test
    public void test () {
        int[] array = new int[]{3,5,9};
        shiftingLetters("abc", array);
    }

}
