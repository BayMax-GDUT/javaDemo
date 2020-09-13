package com.demo.dataStructure.sequence;

/**
 * 线性表接口
 * @param <T>
 */
public interface SequenceList<T> {

    void clear();

    boolean isEmpty();

    int length();

    T get(int i);

    void insert(T t);

    void insert(int i, T t);

    T remove(int i);

    int indexOf(T t);
}
