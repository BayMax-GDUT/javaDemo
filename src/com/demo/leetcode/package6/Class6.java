package com.demo.leetcode.package6;


public class Class6 {

    public static String convert(String s,int numRows){

        //先根据所需要的行数得出一行的最长长度 做成二维数组

        //向上取整获取行长
        int length = (int) Math.ceil(s.length() * 1.0 / numRows);
        //将二维数组所有元素赋值为空格字符串
        //目标字符串字符插入时进行替换
        String[][] result = new String[numRows][length];
        for(int i = 0;i < numRows;i++){
            for(int j = 0;j < length;j++){
                result[i][j] = "  ";
            }
            result[0][i] = s.charAt(i) + "";
        }

        //第一行
        for(int i = 0;i <= length;i++){
            result[0][i * (numRows - 1)] = s.charAt(i * (2 * numRows - 2)) + "";
        }
        //第二行
        for(int i = 0;i < length;i += 2){

        }
        return length + "";
    }
}
