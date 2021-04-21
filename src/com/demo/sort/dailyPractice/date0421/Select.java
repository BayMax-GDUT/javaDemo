package com.demo.sort.dailyPractice.date0421;

public class Select {

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int maxIndex = 0;
            for (int j = 0; j < array.length - i; j++) {
                if (array[maxIndex] < array[j]) {
                    maxIndex = j;
                }
            }
            int temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[maxIndex];
            array[maxIndex] = temp;
        }
        return array;
    }
}
