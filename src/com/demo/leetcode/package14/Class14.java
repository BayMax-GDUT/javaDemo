package com.demo.leetcode.package14;

public class Class14 {

    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";   //最长共同前缀

        if(strs.length < 1)return "";

        //找出数组里长度最短的字符串，比较字符的次数以该字符串长度为准
        int length = strs[0].length();
        for(String str:strs){
            if(str.length() < length) {
                length = str.length();
            }
        }

        int i = 0;
        while(i < length){
            char a = strs[0].charAt(i);

            for(int j = 1;j < strs.length;j++){
                if(strs[j].charAt(i) != a){
                    return commonPrefix;
                }
            }
            commonPrefix += a;
            ++i;
        }
        return commonPrefix;
    }
}
