package com.demo.sort.dailyPractice.date0504;

public class Quick {

    public static int[] sort (int[] array) {
        recursive(array, 0, array.length - 1);
        return array;
    }

    public static void recursive (int[] array, int start, int end) {
        if (array.length == 0 || start >= end) return;
        int left = start;
        int right = end;
        int temp = array[left];
        while (right > left) {
            while (right > left && array[right] > temp) {
                right--;
            }
            if (right > left) {
                array[left++] = array[right];
            }
            while (right > left && array[left] < temp) {
                left++;
            }
            if (right > left) {
                array[right--] = array[left];
            }
        }
        array[left] = temp;
        recursive(array, start, left - 1);
        recursive(array, left + 1, end);
    }
}
