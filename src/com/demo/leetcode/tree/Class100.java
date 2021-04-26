package com.demo.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Class100 {

    /**
     * 将树节点放入队列，从队列拿出来比较数值和队列的长度，只有有一个不相同就返回false
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.add(p);
        queue2.add(q);
        while(queue1.size() != 0 || queue2.size() != 0) {
            int currentSize = queue1.size();
            for (int i = 0; i < currentSize; i++) {
                if (queue1.peek() == null && queue2.peek() == null) {

                } else if ((queue1.peek() == null && queue2.peek() != null) || (queue1.peek() != null && queue2.peek() == null)) {
                    return false;
                } else {
                    if (queue1.peek().val != queue2.peek().val) return false;
                    queue1.add(queue1.peek().left);
                    queue1.add(queue1.peek().right);
                    queue2.add(queue2.peek().left);
                    queue2.add(queue2.peek().right);
                }
                queue1.poll();
                queue2.poll();
            }
            if (queue1.size() != queue2.size()) {
                return false;
            }
        }
        if (queue1.size() != queue2.size()) {
            return false;
        } else {
            return true;
        }
    }

}
