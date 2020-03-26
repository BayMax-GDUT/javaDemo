package com.demo;


import com.demo.entity.Hero;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test {

    public static void main(String[] args){

        int index = 100000;
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        arrayList.add("1");
        linkedList.add("1");
        long result = insert(arrayList,index,0);
//        System.out.println("ArrayList插入最前面使用时间为：" + result);
//        result = insert(linkedList,index,0);
//        System.out.println("LinkedList插入最前面使用时间为：" + result);
//        result = insert(arrayList,index,index / 2);
//        System.out.println("ArrayList插入中间使用时间为：" + result);
//        result = insert(linkedList,index,index / 2);
//        System.out.println("LinkedList插入中间使用时间为：" + result);
        result = insert(arrayList, index, -1);
        System.out.println("ArrayList插入最后面使用时间为：" + result);
        result = insert(linkedList, index, -1);
        System.out.println("LinkedList插入最后面使用时间为：" + result);
    }

    public static long insert(List list, int size, int local){
        long startTime = System.currentTimeMillis();
        if (local >= 0) {
            for (int i = 0; i < size; i++) {
                list.add(local, i + "");
            }
        } else {
            if(list instanceof LinkedList) {
                LinkedList list1 = (LinkedList)list;
                for(int i = 0;i < size;i++) {
                    ((LinkedList) list).offer(i + "");
                }
            } else {
                for (int i = 0;i < size;i++) {
                    list.add(i + "");
                }
            }
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }
}
