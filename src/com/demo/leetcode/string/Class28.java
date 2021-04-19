package com.demo.leetcode.string;

public class Class28 {

    public int strStr(String haystack, String needle) {
        if(needle.equals(null) || needle.equals(""))return 0;
        return haystack.indexOf(needle);
    }
}
