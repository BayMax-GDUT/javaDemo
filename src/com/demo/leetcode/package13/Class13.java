package com.demo.leetcode.package13;

import org.junit.Test;

public class Class13 {

    public int romanToInt(String s) {
        int result = 0;
        char preChar = ' ';
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'M':
                    result += 1000;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'C':
                    if (preChar == 'D' || preChar == 'M') {
                        result -= 100;
                    } else {
                        result += 100;
                    }
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'X':
                    if (preChar == 'L' || preChar == 'C') {
                        result -= 10;
                    } else {
                        result += 10;
                    }
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'I':
                    if (preChar == 'V' || preChar == 'X') {
                        result -= 1;
                    } else {
                        result += 1;
                    }
                    break;
            }
            preChar = s.charAt(i);
        }
        return result;
    }
}
