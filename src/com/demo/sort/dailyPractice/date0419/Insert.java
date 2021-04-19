package com.demo.sort.dailyPractice.date0419;

public class Insert {

    public static int[] sort (int[] array) {
        for (int i = 1; i < array.length; i++) {
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
