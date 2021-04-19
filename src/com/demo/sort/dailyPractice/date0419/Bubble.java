package com.demo.sort.dailyPractice.date0419;

public class Bubble {

    public static int[] sort (int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean change = false;
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    change = true;
                }
            }
            // 优化，如果一个内循环走完都没有交换过数据，则已是排序完成
            if (change) break;
        }
        return array;
    }
}
