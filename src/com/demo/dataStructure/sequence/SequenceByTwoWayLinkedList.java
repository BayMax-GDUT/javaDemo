package com.demo.dataStructure.sequence;

/**
 * 双向链表实现的线性表
 * @param <T>
 */
public class SequenceByTwoWayLinkedList<T extends Number> implements SequenceList<T> {

    private Node first;

    private Node last;

    private int N;

    private class Node {

        T data;

        Node next;

        Node pre;

        private Node() {}

        public Node(T t) {
            this.data = t;
        }

    }

    @Override
    public void clear() {
        this.N = 0;
        this.first = null;
        this.last = null;
    }

    @Override
    public boolean isEmpty() {
        return this.N == 0;
    }

    @Override
    public int length() {
        return this.N;
    }

    @Override
    public T get(int i) {
        if (i < 0 || i >= this.N) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int half = this.N / 2;
        if (i >= half) {
            // 从后面开始查询
            for(int j = this.N - 1; j > i; j--) {

            }
        } else {
            // 从前面开始查询
        }
        return null;
    }

    @Override
    public void insert(T t) {

    }

    @Override
    public void insert(int i, T t) {

    }

    @Override
    public T remove(int i) {
        return null;
    }

    @Override
    public int indexOf(T t) {
        return 0;
    }

    public T getFirst() {
        return null;
    }

    public T getLast() {
        return null;
    }
}
