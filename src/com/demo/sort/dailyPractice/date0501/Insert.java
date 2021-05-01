package com.demo.sort.dailyPractice.date0501;

public class Insert {

    public static int[] sort (int[] array) {
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                array[j] = current;
                j -= 1;
            }
        }
        return array;
    }
}
