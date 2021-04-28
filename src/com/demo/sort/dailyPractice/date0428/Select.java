package com.demo.sort.dailyPractice.date0428;

public class Select {

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int maxIndex = 0;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = array[maxIndex];
            array[maxIndex] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
