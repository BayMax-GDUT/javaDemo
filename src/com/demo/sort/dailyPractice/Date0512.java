package com.demo.sort.dailyPractice;

import com.demo.sort.dailyPractice.template.Sort;

public class Date0512 {

    public static int[] bubble(int[] array) {
        boolean isSort = false;
        for (int i = 0; i < array.length && !isSort; i++) {
            isSort = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSort = false;
                }
            }
        }
        return array;
    }

    public static int[] count(int[] array) {
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

    public static int[] insert(int[] array) {
        for (int i = 0; i < array.length; i++) {
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

    public static int[] quick(int[] array, int start, int end) {
        if (array == null || array.length == 0 || start > end) return array;
        int left = start;
        int right = end;
        int temp = array[left];
        while (left < right) {
            while (left < right && array[right] > temp) {
                right--;
            }
            if (left < right) {
                array[left++] = array[right];
            }
            while (left < right && array[left] > temp) {
                left++;
            }
            if (left < right) {
                array[right--] = array[left];
            }
        }
        array[left] = temp;
        quick(array, start, left - 1);
        quick(array, left + 1, end);
        return array;
    }

    public static int[] select(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int maxIndex = 0;
            int swapCount = 0;
            for (int j = 1; j < array.length - i; j++) {
                if (array[maxIndex] < array[j]) {
                    maxIndex = j;
                    swapCount++;
                }
            }
            if (swapCount == array.length - i - 1) break;
            int temp = array[maxIndex];
            array[maxIndex] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    public static int[] shell(int[] array) {
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
