package com.demo.sort.dailyPractice.date0422;

public class Select {

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int maxIndex = 0;
            int max = array[maxIndex];
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > max) {
                    max = array[j];
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
