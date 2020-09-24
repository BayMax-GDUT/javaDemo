package com.demo.dataStructure.sequence.tree;

import com.sun.xml.internal.bind.marshaller.NioEscapeHandler;
import org.apache.poi.ss.formula.functions.T;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class binaryTreeByLinkedList<T extends Number> implements BinaryTree {

    private Node root = null;

    private Integer length;

    private class Node {
        private Integer data;

        private Node before = null;

        private Node after = null;

        private Node(){}

        public Node(Integer integer) { data = integer; }

        public Integer getData() {
            return data;
        }

        public void setData(Integer data) {
            this.data = data;
        }

        public Node getBefore() {
            return before;
        }

        public void setBefore(Node before) {
            this.before = before;
        }

        public Node getAfter() {
            return after;
        }

        public void setAfter(Node after) {
            this.after = after;
        }
    }

    @Override
    public void add(Integer data) {
        if (root == null) {
            root = new Node(data);
        }
        else {
            insert(data, root);
        }
    }

    /**
     * 删除节点遵循原则：删除后接上左节点下最大的节点或者右节点下最小的节点
     * @param data
     * @return
     */
    @Override
    public Integer remove(Integer data) {
        if (root == null) {
            return null;
        } else if (data <= root.data) {

        }
        return null;
    }

    @Override
    public Integer length() {
        return length;
    }

    @Override
    public List<Integer> list() {
        return null;
    }

    /**
     * 查看节点的值是否等于data，如果是，删除（递归方法）
     * @param data
     * @param node
     * @return
     */
    private Integer delete(Integer data, Node node) {
//        if ()
        return null;
    }

    /**
     * 查找空节点插入data（递归方法）
     * @param data
     * @param node
     */
    private void insert (Integer data, Node node) {
        if (node == null) {
            node = new Node(data);
        } else if (data <= node.data) {
            insert(data, node.getBefore());
        } else if (data > node.data) {
            insert(data, node.getAfter());
        }
    }

    /**
     * 找出某个节点下面的最大值（包括该节点）
     * @param node
     * @return
     */
    private Integer findMax (Node node) {
        if (node == null) return null;
        Node max = node;
        while(max.after != null) {
            max = max.after;
        }
        return max.data;
    }

    /**
     * 找出某个节点下面的最小值（包括该节点）
     * @param node
     * @return
     */
    private Integer findMin (Node node) {
        if (node == null) return null;
        Node min = node;
        while(min.before != null) {
            min = min.before;
        }
        return min.data;
    }

    /**
     * 前序遍历
     * @param node
     * @param list
     * @return
     */
    private void preOrderTraverse (Node node, List<Node> list) {
        if (node == null) return;
        list.add(node);
        preOrderTraverse(node.before, list);
        preOrderTraverse(node.after, list);
    }

    /**
     * 中序遍历
     * @param node
     * @param list
     */
    private void inOrderTraverse (Node node, List<Node> list) {
        if (node == null) return;
        inOrderTraverse(node.before, list);
        list.add(node);
        inOrderTraverse(node.after, list);
    }

    private void postOrderTraverse (Node node, List<Node> list) {
        if (node == null) return;
        postOrderTraverse(node.before, list);
        postOrderTraverse(node.after, list);
        list.add(node);
    }
}
