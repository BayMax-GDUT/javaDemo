package com.demo.sort.dailyPractice.date0419;

public class Count {

    public static int[] sort (int[] array) {
        if (array.length <= 1) return array;
        // 先找出最小值和最大值
        int max = array[0], min = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);
        }
        int[] countArray = new int[max - min + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i] - min] += 1;
        }
        int[] result = new int[array.length];
        int index = 0; // 插入result的位置
        for (int i = 0; i < countArray.length; i++) {
            while (countArray[i] != 0) {
                result[index++] = i + min;
                countArray[i]--;
            }
        }
        return result;
    }
}
