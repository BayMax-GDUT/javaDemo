package com.demo.sort;

public class XuanZe implements BaseSort {

    @Override
    public int[] sort(int[] array) {


        int length = array.length;
        for(int i = 0;i < length - 1;i++){

            //初始最小值的索引为当前次循环起点
            int index = i;
            for(int j = 0;j < length - i - 1;j++) {
                if(array[index] > array[i + j]){
                    index = i + j;
                }
            }
            //交换当前次循环最小值与起点
            array[i] = array[i] + array[index];
            array[index] = array[i] - array[index];
            array[i] = array[i] - array[index];
        }
        return array;
    }
}
