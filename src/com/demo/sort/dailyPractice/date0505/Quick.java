package com.demo.sort.dailyPractice.date0505;

public class Quick {

    public static int[] sort (int[] array, int start, int end) {
        if (array.length == 0 || start >= end) return new int[0];
        int temp = array[start];
        int left = start;
        int right = end;
        while (left < right) {
            while (left < right && array[right] > temp) {
                right--;
            }
            if (left < right) {
                array[left++] = array[right];
            }
            while (left < right && array[left] < temp) {
                left++;
            }
            if (left < right) {
                array[right--] = array[left];
            }
        }
        array[left] = temp;
        sort(array, start, left - 1);
        sort(array, left + 1, end);
        return array;
    }

}
