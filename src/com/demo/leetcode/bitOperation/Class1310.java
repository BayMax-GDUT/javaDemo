package com.demo.leetcode.bitOperation;

import java.util.HashMap;
import java.util.Map;

public class Class1310 {

    public int[] xorQueries(int[] arr, int[][] queries) {
        if (arr == null || arr.length == 0 || queries == null || queries.length == 0) return null;
        int[] store = new int[arr.length];
        store[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            store[i] = store[i - 1] ^ arr[i];
        }
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int temp = store[queries[i][0]] ^ store[queries[i][1]] ^ arr[queries[i][0]];
            result[i] = temp;
        }
        return result;
    }

}
