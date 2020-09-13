package com.demo.dataStructure.sequence;

/**
 * 数组实现的线性表
 * @param <T>
 */
public class SequenceByArray<T extends Number> implements SequenceList<T> {

    private Object[] eles;

    private int N;

    private SequenceByArray() {}

    public SequenceByArray(int length) {
        this.eles = new Object[length];
        this.N = 0;
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
        return (T) this.eles[i];
    }

    @Override
    public void insert(T t) {
        this.insert(this.N, t);
    }

    @Override
    public void insert(int i, T t) {
        if (this.N == this.eles.length || i < 0 || i > this.N) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for(int j = this.N; j > i; j--) {
            this.eles[j] = this.eles[j - 1];
        }
        this.eles[i] = t;
        this.N++;
    }

    @Override
    public T remove(int i) {
        if (this.N == this.eles.length || i < 0 || i > this.N) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T result = (T)this.eles[i];
        for(int j = i; j < this.N; j++) {
            this.eles[j] = this.eles[j + 1];
        }
        this.N--;
        return result;
    }

    @Override
    public int indexOf(T t) {
        for(int i = 0; i < this.N; i++) {
            if (t.equals(this.eles[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.N; i++) {
            sb.append(this.eles[i].toString() + ", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
