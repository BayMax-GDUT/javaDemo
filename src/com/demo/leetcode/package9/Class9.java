package com.demo.leetcode.package9;

public class Class9 {

    public boolean isPalindrome(int x){
        //字符串做法
//        String str = x + "";
//        return str.equals(new StringBuffer(str).reverse().toString());

        //int做法
        if(x < 0)return false;
        else if(x < 10)return true;
        else{
            //使用y作为x的镜像
            int y = x;
            int result = 0;
            while(true){
                if(y / 10 == 0 && y % 10 == 0){
                    break;
                }
                result *= 10;
                result += y % 10;
                y /= 10;
            }
            return result == x;
        }
    }
}
