package com.demo.dataStructure.sequence.queue;

public class QueueByLinkedList<T> implements Queue<T> {

    private Integer maxLength;

    private Integer N;

    private Node front;

    private Node end;

    class Node {

        T data;

        Node next;

        Node() {}

        Node(T t) { data = t; }
    }

    @Override
    public void InitQueue(Integer count) {
        Node point = new Node();
        front = point;
        end = point;
        N = 0;
        maxLength = count;
    }

    @Override
    public void inQueue(T t) {
        if (N != null && N == 0) {
            front = new Node(t);
            end = front;
            N++;
        } else if (N != null && N < maxLength) {
            Node newEnd = new Node(t);
            end.next = newEnd;
            end = end.next;
            N++;
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public T outQueue() {
        if (N != null && N > 0) {
            T t = front.data;
            if (N > 1) {
                front = front.next;
            } else {
                front = end = new Node();
            }
            N--;
            return t;
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public T frontQueue() {
        if (N != null && N > 0) {
            return front.data;
        } else {
            throw new RuntimeException();
        }
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
        Node node = front;
        for (Integer integer = 0; integer < N; integer++) {
            sb.append(node.data + " ");
            node = node.next;
        }
        return sb.toString();
    }
}
