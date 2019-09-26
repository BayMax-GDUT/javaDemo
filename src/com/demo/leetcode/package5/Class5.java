package com.demo.leetcode.package5;

import java.util.logging.Level;

public class Class5 {
    public String longestPalindrome(String s){
        int index = 1;
        String result = s.substring(0,1);
        String curr = "";
        //aba型
        while(index < s.length() - 1){
            curr = "" + s.charAt(index);
            int count = 1;
            while(true){
                if(s.charAt(index - count) == s.charAt(index + count)){
                    curr = s.charAt(index - count) + curr + s.charAt(index + count);
                    count++;
                    if(index - count < 0 || index + count >= s.length()){ break; }
                }
                else{ break;}
            }
            if(curr.length() > result.length()){ result = curr;}
            index++;
        }
        //aa型
        index = 0;
        curr = "";
        while(index < s.length() - 1){
            int count = 1;
            if(s.charAt(index) != s.charAt(index + 1)){
                index++;
                continue;
            }
            curr = s.substring(index,index + 2);
            while(true){
                if(index - count < 0 || index + count + 1 >= s.length()){
                    break;
                }
                if(s.charAt(index - count) == s.charAt(index + count + 1)){
                    curr = s.charAt(index - count) + curr + s.charAt(index + count + 1);
                    count++;
                }
                else {
                    break;
                }
            }

            if(curr.length() > result.length()){ result = curr;}
            index++;
        }
        return result;
    }
}
