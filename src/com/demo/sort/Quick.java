package com.demo.sort;

public class Quick implements BaseSort{

    @Override
    public int[] sort(int[] arr, int bgn, int end)  //arr must be the reference of real param
    {

        //如果只有一个数或没有 返回
        if(bgn >= end - 1){
            return null;
        }

        int left = bgn;
        int right = end - 1;
        int std = arr[left];
        while(left < right){

            //从末端开始处理小于标准数
            while (left < right){
                if(arr[right] < std){
                    arr[left] = arr[right];
                    left++;
                    break;
                }
                right--;
            }

            //处理一个小于数后必须处理一个大于数才可以继续 否则有一个位是重复的
            //若left与right相同还没有找到一个大于数 则左边全是小于标准数 右边全是大于标准数

            //从首端开始处理大于标准数
            while (left < right){
                if(arr[left] >= std){
                    arr[right] = arr[left];
                    right--;
                    break;
                }
                left++;
            }

        }
        arr[left] = std;
        //标准数左边
        sort(arr,bgn,left);
        sort(arr,right + 1,end);
        return arr;
    }
}
