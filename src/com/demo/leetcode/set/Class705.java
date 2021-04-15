package com.demo.leetcode.set;

public class Class705 {

    class MyHashSet {

        /**
         * 使用数组储存数据
         * length记录实际数据的数量
         */
        int[] data;
        int length;

        /** Initialize your data structure here. */
        public MyHashSet() {
            data = new int[10001];
        }

        public void add(int key) {
            if (contains(key)) {
                return;
            }
            data[length++] = key;
        }

        public void remove(int key) {
            for (int i = 0; i < length; i++) {
                if (data[i] == key) {
                    for (int j = i + 1; j < length; j++) {
                        data[j - 1] = data[j];
                    }
                    data[length - 1] = 0;
                    length--;
                    break;
                }
            }
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            for (int i = 0; i < length; i++) {
                if (data[i] == key) return true;
            }
            return false;
        }
    }

}
