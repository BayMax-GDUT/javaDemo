package com.demo.dataStructure.sequence.queue;

import org.junit.Test;

public class QueueByArray<T> implements Queue<T> {

    public Object[] array;

    /**
     * data`s count
     */
    private Integer N;

    public QueueByArray() {}

    @Override
    public void InitQueue(Integer count) {
        array = new Object[count];
        N = 0;
    }

    @Override
    public void inQueue(T t) {
        if (N == null || N == array.length) {
            throw new RuntimeException();
        }
        array[N++] = t;
    }

    @Override
    public T outQueue() {
        if (N == null || N == 0) {
            throw new RuntimeException();
        }
        T t = (T) array[0];
        for (int i = 0; i < N; i++) {
            array[i] = array[i + 1];
        }
        N--;
        return t;
    }

    @Override
    public T frontQueue() {
        if (N == null || N == 0) {
            throw new RuntimeException();
        }
        return (T)array[0];
    }

    @Override
    public Boolean emptyQueue() {
        return N != null && N > 0;
    }

    @Override
    public String toString() {
        String str = "当前排队人数：" + N + "\n分别为：";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for (Integer integer = 0; integer < N; integer++) {
            sb.append(array[integer] + " ");
        }
        return sb.toString();
    }
}
