package com.demo.sort;

public class MaoPao implements BaseSort{

    /**
     * 冒泡排序
     * 相邻互换，将最大的数放到数组的最后
     *
     */
    @Override
    public int[] sort(int[] array,int bgn,int end) {

        int length = array.length;
        boolean isSorted = true;
        for (int i = 0;i < length && isSorted;i++){

            isSorted = false;
            for(int j = 0;j < length - i - 1;j++){
                if(array[j] > array[j + 1]){
                    array[j + 1] = array[j] + array[j + 1];
                    array[j] = array[j + 1] - array[j];
                    array[j + 1] = array[j + 1] - array[j];
                    isSorted = true;
                }
            }
        }
        return array;
    }
}
