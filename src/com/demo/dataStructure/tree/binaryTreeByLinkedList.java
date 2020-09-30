package com.demo.dataStructure.tree;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

public class binaryTreeByLinkedList<T extends Number> implements BinaryTree {

    private Node root = null;

    private Integer length;

    @Data
    @Accessors(chain = true)
    private class Node {
        private Integer data;

        private Node before = null;

        private Node after = null;

        private Node(){}

        public Node(Integer integer) { data = integer; }
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
     * 删除没有子节点的节点：直接删除
     * 删除有一个子节点的节点：将其子节点接到其父节点上
     * 删除有两个子节点的节点：删除后左子节点下最大的节点接上右子节点或者右节点下最小的节点接上左子节点
     * @param data
     * @return
     */
    @Override
    public Integer remove(Integer data) {
        if (root == null) {
            return null;
        } else {
            delete(data, root);
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
     * 查看节点的值是否等于data，如果是，删除（循环方法）
     * @param data
     * @param node
     * @return
     */
    private Integer delete(Integer data, Node root) {
        if (root == null) {
            return null;
        }
        Integer result = null;
        // 先找到该节点
        Node temp = root;
        Node parent = null;
        while (!data.equals(temp.data)) {
            if (data < temp.data) {
                // 判断是否为空节点，true即找不到要删除的节点
                if (temp.before == null) {
                    return null;
                } else {
                    parent = temp;
                    temp = temp.before;
                    continue;
                }
            } else {
                // 判断是否为空节点，true即找不到要删除的节点
                if (temp.after == null) {
                    return null;
                } else {
                    parent = temp;
                    temp = temp.after;
                    continue;
                }
            }
        }
        result = temp.data;
        // 删除的是根节点
        if (parent == null) {
            if (temp.after == null && temp.before == null) {
                temp = null;
            } else if (temp.after == null) {
                temp = temp.before;
            } else if (temp.before == null) {
                temp = temp.after;
            } else {
                // 有两个子节点 两种方案
                // 方案一 根节点指到左节点 右节点接到左节点下最大的节点下面
                Node leftMax = findMax(temp.before);
                leftMax.after = temp.after;
                temp = temp.before;
                // 方案二 根节点指到右节点 左节点接到右节点下最小的节点下面
                Node rightMin = findMin(temp.after);
                rightMin.before = temp.before;
                temp = temp.after;
            }
        } else {
            // 先判断是父节点的左子节点还是右子节点
            boolean isLeft = parent.before.data.equals(temp.data);
            // 判断有多少个子节点 使用不同的删除方法
            if (temp.before == null && temp.after == null) {
                if (isLeft) {
                    parent.before = null;
                } else {
                    parent.after = null;
                }
            } else if (temp.before == null) {
                if (isLeft) {
                    parent.before = temp.after;
                } else {
                    parent.after = temp.after;
                }
            } else if (temp.after == null) {
                if (isLeft) {
                    parent.before = temp.before;
                } else {
                    parent.after = temp.before;
                }
            } else {
                // 有两个子节点 两种方案
                // 方案一 父节点指到左节点 右节点接到左节点下最大的节点下面
                Node leftMax = findMax(temp.before);
                leftMax.after = temp.after;
                if (isLeft) {
                    parent.before = temp.before;
                } else {
                    parent.after = temp.before;
                }
                // 方案二 父节点指到右节点 左节点接到右节点下最小的节点下面
                Node rightMin = findMin(temp.after);
                rightMin.before = temp.before;
                if (isLeft) {
                    parent.before = temp.after;
                } else {
                    parent.after = temp.after;
                }
            }
        }
        return result;
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
    private Node findMax (Node node) {
        if (node == null) return null;
        Node max = node;
        while(max.after != null) {
            max = max.after;
        }
        return max;
    }

    /**
     * 找出某个节点下面的最小值（包括该节点）
     * @param node
     * @return
     */
    private Node findMin (Node node) {
        if (node == null) return null;
        Node min = node;
        while(min.before != null) {
            min = min.before;
        }
        return min;
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
