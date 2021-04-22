package com.demo.sort.dailyPractice.date0422;

public class Shell {

    public static int[] sort (int[] array) {
        for (int i = array.length / 2; i > 0; i /= 2) {
            for (int j = 0; j < array.length; j++) {
                int current = array[j];
                int k = j - i;
                while (k >= 0 && current < array[k]) {
                    array[k + i] = array[k];
                    array[k] = current;
                    k -= i;
                }
            }
        }
        return array;
    }
}
