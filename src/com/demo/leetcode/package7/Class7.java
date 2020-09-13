package com.demo.leetcode.package7;

import org.junit.Test;

public class Class7 {
    @Test
    public void reverse(){
        int x = -2147483648;
        boolean isPositive = x > 0;
        //为负数，转成正数进行运算
        if(!isPositive){
            x = 0 - x;
        }
        int single;
        Long result = 0L;
        while(true){
            if(x / 10 == 0 && x % 10 == 0)
                break;
            result *= 10;
            single = x % 10;
            result += single;
            x /= 10;
        }
        if(!isPositive){result = 0 - result;}
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)return;
        System.out.println(result.intValue());
    }

    @Test
    public void reverse1() {
        int x = -2147483648;
        boolean isNegative = false;
        long xTemp = x;
        if (x < 0) {
            isNegative = true;
            xTemp = 0L - x;
        }
        StringBuilder stringBuilder = new StringBuilder("" + xTemp);
        stringBuilder = stringBuilder.reverse();
        String str = stringBuilder.toString();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                str = str.substring(i);
                break;
            }
        }
        if (isNegative) {
            str = "-" + str;
        }
        Long longTemp = Long.parseLong(str);
        if (longTemp > Integer.MAX_VALUE || longTemp < Integer.MIN_VALUE) return;
        System.out.println(longTemp.intValue());
    }
}
