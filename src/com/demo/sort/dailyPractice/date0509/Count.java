package com.demo.sort.dailyPractice.date0509;

public class Count {

    /**
     * 平均 O(n + k)
     * 最坏 O(n + k)
     * 最好 O(n + k)
     * 空间 O(k)
     * k是数据范围（max - min + 1）
     * 稳定
     */
    public static int[] sort (int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);
        }
        int[] countArray = new int[max - min + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min]++;
        }
        int index = 0;
        for (int i = 0; i < countArray.length; i++) {
            array[index++] = i + min;
            countArray[i]--;
        }
        return array;
    }
}
