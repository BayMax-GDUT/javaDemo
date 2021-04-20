package com.demo.sort.dailyPractice.date0420;

public class Bubble {

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean change = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    change = true;
                }
            }
            // 优化，如果一个内循环走完都没有交换过数据，则已是排序完成
            if (!change) break;
        }
        return array;
    }
}
