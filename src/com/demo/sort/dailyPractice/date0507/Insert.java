package com.demo.sort.dailyPractice.date0507;

public class Insert {

    /**
     * 插入排序
     * 平均 O(n^2)
     * 最坏 O(n^2)
     * 最好 O(n)
     * 空间 O(1)
     * 稳定
     */
    public static int[] sort (int[] array) {
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                array[j] = current;
                j--;
            }
        }
        return array;
    }
}
