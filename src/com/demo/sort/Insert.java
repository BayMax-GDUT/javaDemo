package com.demo.sort;

import org.junit.Test;

/**
 * 插入排序
 * 从首位开始当成是一个已排序好的数组
 * 第二位开始与已排序的数组数据进行比较
 * 如果比该数据小则往前移，直到大于已排序数组里的某个数据
 * 等于是数组中前面一部分是已排序的，后面一部分是未排序的
 */
public class Insert implements BaseSort {

    @Override
    public int[] sort(int[] array, int bgn, int end) {
        if (array.length <= 1) return array;
        for(int i = 1; i < array.length; i++) {
            int j = i - 1;
            int current = array[i];
            while (j >= 0 && array[j] > current) {
                // j+1就是current所在的位置
                array[j + 1] = array[j];
                array[j] = current;
                j--;
            }
        }
        return array;
    }

}
