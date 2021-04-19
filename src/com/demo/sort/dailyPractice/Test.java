package com.demo.sort.dailyPractice;

import com.demo.sort.dailyPractice.date0419.*;

/**
 * 2021/4/19起，每天写排序练习题
 * 单数天写计数排序、选择排序、插入排序
 * 双数天写冒泡排序、希尔排序
 */
public class Test {

    public static void main(String[] args) {
        int[] testData = new int[]{2,7,6,5,3,1,9,8,4,0};
        int[] sort = Count.sort(testData);
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i]);
        }
        System.out.println();
        sort = Select.sort(testData);
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i]);
        }
        System.out.println();
        sort = Insert.sort(testData);
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i]);
        }
        System.out.println();
        sort = Bubble.sort(testData);
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i]);
        }
        System.out.println();
        sort = Shell.sort(testData);
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i]);
        }
        System.out.println();
    }
}
