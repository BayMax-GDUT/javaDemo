package com.demo.leetcode.hashTable;

public class Class389 {

    /**
     * 计算t所有字符的ASCII码之和，减去s所有字符的ASCII码之和，得出多出的那个字母的ASCII码
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {
        int num = 0;
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        for (int i = 0; i < chars2.length; i++) {
            num += chars2[i];
        }
        for (int i = 0; i < chars1.length; i++) {
            num -= chars1[i];
        }
        return (char) num;
    }

}
