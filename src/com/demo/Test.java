package com.demo;

import com.demo.leetcode.package2.Class2;
import com.demo.leetcode.package2.ListNode;
import com.demo.leetcode.package3.Class3;
import com.demo.leetcode.package5.Class5;
import com.demo.leetcode.package6.Class6;
import com.demo.leetcode.package7.Class7;
import com.demo.leetcode.package9.Class9;
import com.demo.sort.*;

public class Test {

    public static void main(String[] args){

        BaseSort bs = new ChaRu();
        int[] array = bs.sort(new int[]{10,4,1,7,8,5,6,3,9,0},0,10);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
