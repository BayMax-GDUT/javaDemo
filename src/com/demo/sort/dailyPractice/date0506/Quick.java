package com.demo.sort.dailyPractice.date0506;

public class Quick {

    public static int[] sort (int[] array, int start, int end) {
        if (array.length == 0 || start >= end) return array;
        int left = start;
        int right = end;
        int temp = array[left];
        while (left < right) {
            while (left < right && temp < array[right]) {
                right--;
            }
            if (left < right) {
                array[left++] = array[right];
            }
            while (left < right && temp > array[left]) {
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
