package com.demo.leetcode.string;

import org.junit.Test;

public class Class6 {

    public static String convert(String s,int numRows){
        /**
         *      *
         *      *       *
         *      *   *
         *      *
         *      找出这个形状的个数为2n - 2，n为行数
         *      先将字符个数除以2n - 2，看有几个完整的这个形状，乘以n - 1为列数
         *      再将字符个数模2n - 2，看多出来多少个，如果多出来的<=n，多一列，n < < 2n - 2，多得数 - (n - 1)列
         */
        if (numRows == 1) return s;
        int completed = s.length() / (2 * numRows - 2) * (numRows - 1);
        int unCompleted = s.length() % (2 * numRows - 2) <= numRows ? 1 : s.length() % (2 * numRows - 2) - (numRows - 1);
        char[][] array = new char[numRows][completed + unCompleted];
        // 到0就沿着同一列往下走，到numRows就斜着往上走
        boolean rising = false;
        // 二维数组的索引
        int i = 0, j = 0;
        for (int l = 0; l < s.length(); l++) {
            if (rising) {
                array[i--][j++] = s.charAt(l);
                if (i == 0) rising = false;
            } else {
                array[i++][j] = s.charAt(l);
                if (i == numRows - 1) rising = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i1 = 0; i1 < array.length; i1++) {
            for (int i2 = 0; i2 < array[0].length; i2++) {
                if (array[i1][i2] != '\u0000') {
                    sb.append(array[i1][i2]);
                }
            }
        }
        return sb.toString();
    }

    @Test
    public void test() {
        System.out.println(convert("abcdefghijklmn", 1));
    }
}
