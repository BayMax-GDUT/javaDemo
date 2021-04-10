package com.demo.leetcode.package14;

import org.junit.Test;

public class Class14 {

//    public String longestCommonPrefix(String[] strs) {
//        String commonPrefix = "";   //最长共同前缀
//
//        if(strs.length < 1)return "";
//
//        //找出数组里长度最短的字符串，比较字符的次数以该字符串长度为准
//        int length = strs[0].length();
//        for(String str:strs){
//            if(str.length() < length) {
//                length = str.length();
//            }
//        }
//
//        int i = 0;
//        while(i < length){
//            char a = strs[0].charAt(i);
//
//            for(int j = 1;j < strs.length;j++){
//                if(strs[j].charAt(i) != a){
//                    return commonPrefix;
//                }
//            }
//            commonPrefix += a;
//            ++i;
//        }
//        return commonPrefix;
//    }
    @Test
    public void test() {
        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));;
    }

    public String longestCommonPrefix(String[] strs) {
        int minLength = strs[0].length();
        String str = "";
        for (int i = 1; i < strs.length; i++) {
            minLength = Math.min(minLength, strs[i].length());
        }

        for (int i = 0; i < minLength; i++) {
            for (int j = 1; j < strs.length; j++) {
                char currentChar = strs[0].charAt(i);
                if (strs[j].charAt(i) != currentChar) {
                    return str;
                }
            }
            str += strs[0].charAt(i);
        }
        return str;
    }
}
