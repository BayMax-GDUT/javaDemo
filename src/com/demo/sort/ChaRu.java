package com.demo.sort;

public class ChaRu implements BaseSort {

    @Override
    public int[] sort(int[] arr, int bgn, int end) {
        //把数组第一位数作为一个已经排序好的数组，将后面其他数按大小插入到对应位置，从后面开始迭代
        for(int i = 1;i < arr.length;i++){
            for(int j = i - 1;j >= 0;j--){
                {
                    if(arr[i] < arr[j])
                        continue;
                }
            }
        }
        return arr;
    }

    public void changeLocated(int[] arr,int oldIndex,int newIndex){
        int temp = arr[oldIndex];

        for(int i = oldIndex - 1;i >= newIndex;--i){
            arr[i + 1] = arr[i];
        }
        arr[newIndex] = temp;
    }
}
