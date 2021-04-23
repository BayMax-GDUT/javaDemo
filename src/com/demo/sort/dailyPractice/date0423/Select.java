package com.demo.sort.dailyPractice.date0423;

public class Select {

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[0];
            int maxIndex = 0;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > max) {
                    max = array[j];
                    maxIndex = j;
                }
            }
            int temp = array[array.length - i - 1];
            array[array.length - i - 1] = max;
            array[maxIndex] = temp;
        }
        return array;
    }
}
