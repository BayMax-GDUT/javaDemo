package com.demo.sort;

/**
 * 选择排序
 * 主指针从头开始走
 * 主指针每移动一步，次指针从主指针的位置开始往最后移动，并记录下最小值的索引
 * 将本次最小值与主指针所指的值比较，若本次最小值较小则交换两个数
 */
public class Select implements BaseSort {

    @Override
    public int[] sort(int[] array,int bgn,int end) {


        int length = array.length;
        for(int i = 0;i < length - 1;i++){

            //初始最小值的索引为当前次循环起点
            int index = i;
            for(int j = i + 1;j < length;j++) {
                if(array[index] > array[j]){
                    index = j;
                }
            }
            //交换当前次循环最小值与起点 如果index没有改变 无需交换
            if(index == i){continue;}
            array[i] = array[i] + array[index];
            array[index] = array[i] - array[index];
            array[i] = array[i] - array[index];
        }
        return array;
    }
}
