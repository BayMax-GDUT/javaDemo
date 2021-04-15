package com.demo.sort;

import org.junit.Test;

/**
 * 计数排序
 * 使用一个新的数组放置数据的数量，每出现一个数据，在新数组使用该数字作为索引的位置+1
 * 如出现一个2，newArray[2] += 1
 * 最后将新数组按顺序和数量放入到旧数组中即可
 * 需要知道原数组的最小值与最大值，确定新数组的长度
 */
public class Count implements BaseSort{
    @Override
    public int[] sort(int[] array, int bgn, int end) {
        if (array.length <= 1) return array;
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        // 最小值与0的距离为min，插入值的时候需要对索引进行偏移min的操作
        int[] newArray = new int[max - min + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[array[i] - min]++;
        }
        int index = 0;
        for (int i = 0; i < newArray.length; i++) {
            while (newArray[i] != 0) {
                array[index] = i + min;
                newArray[i]--;
                index++;
            }
        }
        return array;
    }
}
