package com.demo.sort.dailyPractice.date0509;

public class Select {

    /**
     * 平均 O(n^2)
     * 最坏 O(n^2)
     * 最好 O(n)
     * 空间 O(1)
     * 不稳定
     */
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int maxIndex = 0;
            int count = 0;
            for (int j = 1; j < array.length - i; j++) {
                if (array[maxIndex] < array[j]) {
                    maxIndex = j;
                    count++;
                }
            }
            System.out.println("第" + i + "次");
            if (count == array.length - i - 1) break;
            int temp = array[maxIndex];
            array[maxIndex] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
