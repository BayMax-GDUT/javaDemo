package com.demo.sort.dailyPractice.date0507;

public class Quick {

    /**
     * 平均 O(n*logn)
     * 最坏 O(n^2)
     * 最好 O(n*logn)
     * 空间 O(logn——n)
     * 不稳定
     */
    public static int[] sort (int[] array, int start, int end) {
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
