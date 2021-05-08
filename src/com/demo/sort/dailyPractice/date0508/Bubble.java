package com.demo.sort.dailyPractice.date0508;

public class Bubble {

    /**
     * 平均 O(n^2)
     * 最坏 O(n^2)
     * 最好 O(n)
     * 空间 O(1)
     * 稳定
     */
    public static int[] sort (int[] array) {
        boolean isSort = false;
        for (int i = 0; i < array.length && !isSort; i++) {
            isSort = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSort = false;
                }
            }
        }
        return array;
    }
}
