package com.demo.sort.dailyPractice;

public class Date0822 {

    /**
     * 冒泡排序
     * 平均 O(n^2)
     * 最坏 O(n^2)
     * 最好 O(n)
     * 空间 O(1)
     * 稳定
     */
    public static int[] bubble(int[] array) {
        boolean isSort = false;
        for (int i = 0; i < array.length && !isSort; i++) {
            isSort = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    array[j + 1] = array[j + 1] + array[j];
                    array[j] = array[j + 1] - array[j];
                    array[j + 1] = array[j + 1] - array[j];
                    isSort = false;
                }
            }
        }
        return array;
    }

    /**
     * 基数排序
     * 平均 O(n + k)
     * 最坏 O(n + k)
     * 最好 O(n + k)
     * 空间 O(k)
     * k是数据范围（max - min + 1）
     * 稳定
     */
    public static int[] count(int[] array) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            max = Math.max(array[i], max);
            min = Math.min(array[i], min);
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

    /**
     * 插入排序
     * 平均 O(n^2)
     * 最坏 O(n^2)
     * 最好 O(n)
     * 空间 O(1)
     * 稳定
     */
    public static int[] insert(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                array[j] = current;
                j--;
            }
        }
        return array;
    }

    /**
     * 快速排序
     * 平均 O(n*logn)
     * 最坏 O(n^2)
     * 最好 O(n*logn)
     * 空间 O(logn~n)
     * 不稳定
     */
    public static int[] quick(int[] array, int start, int end) {
        if (array.length == 0 || start >= end) return array;
        int left = start;
        int right = end;
        int temp = array[left];
        while (left < right) {
            while (left < right && array[right] > temp) {
                right--;
            }
            while (left < right && array[left] < temp) {
                left++;
            }
            if (left <= right) {
                array[left] = array[left] + array[right];
                array[right] = array[left] - array[right];
                array[left] = array[left] - array[right];
            }
        }
        array[left] = temp;
        quick(array, start, left - 1);
        quick(array, left + 1, end);
        return array;
    }

    /**
     * 选择排序
     * 平均 O(n^2)
     * 最坏 O(n^2)
     * 最好 O(n)
     * 空间 O(1)
     * 不稳定
     */
    public static int[] select(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int maxIndex = 0;
            int swapCount = 0;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                    swapCount++;
                }
            }
            if (swapCount == array.length - i - 1) break;
            array[array.length - i - 1] = array[maxIndex] + array[array.length - i - 1];
            array[maxIndex] = array[array.length - i - 1] - array[maxIndex];
            array[array.length - i - 1] = array[array.length - i - 1] - array[maxIndex];
        }
        return array;
    }

    /**
     * 希尔排序
     * 平均 O(n^1.3)
     * 最坏 O(n^2)
     * 最好 O(n)
     * 空间 O(1)
     * 不稳定
     */
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
