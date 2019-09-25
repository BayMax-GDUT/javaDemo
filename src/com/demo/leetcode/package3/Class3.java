package com.demo.leetcode.package3;

import java.util.ArrayList;
import java.util.List;

public class Class3 {

    public int lengthOfLongestSubString(String s){
        int index = 0;
        String result = "";
        String curr = "";
        while(index < s.length()){
            CharSequence cs1 = "" + s.charAt(index);
            //遇到重复的 中断并比较 若较长 取代 重置子串
            if(curr.contains(cs1)){
//                list.add(curr);
                if(curr.length() > result.length()){result = curr;}
                curr = "";
            }
            //没有重复的或者子串已被重置 将当前索引处字符添加到子串中
            curr += s.charAt(index);

            index++;
        }
        return result.length();
    }
}
