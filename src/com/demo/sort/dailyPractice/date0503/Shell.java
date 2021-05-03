package com.demo.sort.dailyPractice.date0503;

public class Shell {

    public static int[] sort (int[] array) {
        for (int i = array.length / 2; i > 0; i /= 2) {
            for (int j = 0; j < array.length; j++) {
                int current = array[j];
                int l = j - i;
                while (l >= 0 && current < array[l]) {
                    array[l + i] = array[l];
                    array[l] = current;
                    l -= i;
                }
            }
        }
        return array;
    }
}
