package com.demo.dataStructure.sequence;

/**
 * 链表实现的线性表
 * @param <T>
 */
public class SequenceByLinkedList<T extends Number> implements SequenceList<T> {

    private Node node;

    private int N;

    public SequenceByLinkedList() {
        this.node = this.new Node();
        this.N = 0;
    };

    private class Node {

        T data;

        Node next;

        Node(){};

        Node(T t) {
            this.data = t;
        }
    }

    @Override
    public void clear() {
        this.N = 0;
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
        Node node = this.node;
        for(int j = 0; j < i; j++) {
            node = node.next;
        }
        return node.data;
    }

    @Override
    public void insert(T t) {
        this.insert(this.N, t);
    }

    @Override
    public void insert(int i, T t) {
        if (i < 0 || i > this.N) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node newNode = this.new Node(t);
        // 没有数据
        if (this.N == 0) {
            this.node = newNode;
        } else if (i == 0) {
            // 插入最前面
            newNode.next = this.node;
            this.node = newNode;
        } else if (i == this.N) {
            // 插入最后面
            Node node = this.node;
            for(int j = 0; j < this.N - 1; j++) {
                node = node.next;
            }
            node.next = newNode;
        } else {
            // 插入中间
            Node node = this.node;
            for(int j = 0; j < i - 1; j++) {
                node = node.next;
            }
            newNode.next = node.next;
            node.next = newNode;
        }
        this.N++;
    }

    @Override
    public T remove(int i) {
        if (i < 0 || i > this.N) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node node = this.node;
        for(int j = 0; j < i - 1; j++) {
            node = node.next;
        }
        T result = node.next.data;
        node.next = node.next.next;
        this.N--;
        return result;
    }

    @Override
    public int indexOf(T t) {
        Node node = this.node;
        for(int i = 0; i < this.N; i++) {
            if (t.equals(node.data)) {
                return i;
            }
            node = node.next;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node node = this.node;
        for(int i = 0; i < this.N; i++) {
            sb.append(node.data + ", ");
            node = node.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
