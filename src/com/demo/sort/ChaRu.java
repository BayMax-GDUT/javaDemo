package com.demo.sort;

public class ChaRu implements BaseSort {

    @Override
    public int[] sort(int[] arr, int bgn, int end) {
        for (int i = bgn + 1; i < end; ++i) {
            /*
             * 分为1,2两部分处理，可以囊括j = beg - 1时的情况
             * 即需要将arr[i]插入到首元素前的位置，若使用一个for
             * 包括这两部分，则会在发生这种情况时退出
             */
            /*1*/
            int j = i - 1;
            for (; j >= bgn; --j)
                if (arr[j] <= arr[i])
                    break;
            /*2*/
            if (j != i - 1) {
                int temp = arr[i];
                for (int k = i; k > j + 1; --k) {
                    arr[k] = arr[k - 1];
                }
                arr[j + 1] = temp;
            }
        }
        return arr;
    }
}
