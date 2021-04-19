package com.demo.leetcode.heap;

import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;

public class Class692 {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> data = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (!data.containsKey(words[i])) {
                data.put(words[i], 1);
            } else {
                data.put(words[i], data.get(words[i]) + 1);
            }
        }
        PriorityQueue<String> maxHeap = new PriorityQueue<>((o1, o2) -> {
            Integer val1 = data.get(o1);
            Integer val2 = data.get(o2);
            if (val1.equals(val2)) {
                return o1.compareTo(o2);
            } else {
                return val2 - val1;
            }
        });
        for (String s : data.keySet()) {
            maxHeap.add(s);
        }
        LinkedList<String> result = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            result.add(maxHeap.poll());
        }
        return result;
    }
}
