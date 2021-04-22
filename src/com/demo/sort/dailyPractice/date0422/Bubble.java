package com.demo.sort.dailyPractice.date0422;

public class Bubble {

    public static int[] sort (int[] array) {
        boolean isSort = false;
        for (int i = 0; i < array.length && !isSort; i++) {
            isSort = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    isSort = false;
                }
            }
        }
        return array;
    }
}
