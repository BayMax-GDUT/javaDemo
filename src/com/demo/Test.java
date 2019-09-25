package com.demo;

import com.demo.leetcode.package5.Class5;

public class Test {

    public static void main(String[] args){

        String str = "alsshdoigowbfkbasiudfagosfiuahb" + new StringBuffer("fagosfiuahb").reverse().toString() + "sflkasbflaskhfafgkshgaskgh";
        System.out.println(new Class5().longestPalindrome(str));
    }
}
