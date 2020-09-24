package com.demo.dataStructure.sequence.tree;

import java.util.List;
import java.util.PrimitiveIterator;

public interface BinaryTree {

    void add(Integer data);

    Integer remove(Integer data);

    Integer length();

    List<Integer> list();
}
