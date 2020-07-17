package com.demo.sort;

public class Bucket implements BaseSort {

    @Override
    public int[] sort(int[] array, int bgn, int end) {
        //此排序算法只用于只包含大于等于0的数组排序
        if(array == null || array.length < 2)return array;

        int[] index = new int[getMax(array)];
        for (int i = 0;i < array.length;i++){
            index[array[i]]++;
        }
        //消耗内存换取更短的运行时间
        //因为只用于大于等于0 判断数组最后一位不等于0既可以提前结束
        int[] result = new int[array.length];
        for(int i = 0;i < array.length;i++){

            if(result[result.length - 1] != 0)break;
        }
        return result;
    }

    public int getMax(int[] arr){
        if(arr == null || arr.length < 1)return 0;
        int temp = arr[0];
        for (int i : arr) {
            if(i > temp)temp = i;
        }
        return temp;
    }
}
