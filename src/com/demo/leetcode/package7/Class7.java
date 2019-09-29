package com.demo.leetcode.package7;

public class Class7 {
    public int reverse(int x){
        if(x == 0)return 0;
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
//        int length = 1;
//        int a = x;
//        do{
//            int temp = a / 10;
//            if(temp > 0)
//            {
//                a = temp;
//                length++;
//            }
//            else
//                break;
//        }
//        while(true);
//        String str = "";
//        for(int i = 0;i < length;i++){
//            str += x % 10;
//            x /= 10;
//        }
//        int result = Integer.parseInt(str);
        if(!isPositive){result = 0 - result;}
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)return 0;
        return result.intValue();
    }
}
