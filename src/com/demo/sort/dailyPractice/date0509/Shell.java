package com.demo.sort.dailyPractice.date0509;

public class Shell {

    /**
     * 平均 O(n^1.3)
     * 最坏 O(n^2)
     * 最好 O(n)
     * 空间 O(1)
     * 不稳定
     */
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
