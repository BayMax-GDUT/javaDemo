package com.demo.dataStructure.sequence.queue;

public interface Queue<T> {

    void InitQueue(Integer count);

    void inQueue(T t);

    T outQueue();

    T frontQueue();

    Boolean emptyQueue();
}
