package com.demo.sort.dailyPractice.date0504;

public class Count {

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
            while (countArray[i] > 0) {
                array[index++] = i + min;
                countArray[i]--;
            }
        }
        return array;
    }
}
