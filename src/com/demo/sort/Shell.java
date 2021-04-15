package com.demo.sort;

import org.junit.Test;

import javax.sound.midi.Soundbank;

/**
 * 希尔排序
 * index为系数，将一个数组分为（数组长度除以2）个数组
 * 每个数组里各自执行插入排序
 * 全部执行完成后将index继续除以2，重复上面的操作，直到index除以2后为0（向下取整）
 */
public class Shell implements BaseSort{

    @Override
    public int[] sort(int[] array, int bgn, int end) {

        for(int index = array.length / 2; index > 0; index /= 2) {
            for (int i = index; i < array.length; i++) {
                int j = i - index;
                int current = array[i];
                while (j >= 0 && array[j] > current) {
                    // j+index就是current所在的位置
                    array[j + index] = array[j];
                    array[j] = current;
                    j -= index;
                }
            }
        }
        return array;
    }

}
