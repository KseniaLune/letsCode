package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> levelOrder(Tree root) {
        Queue<Tree> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;

        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<>();
            System.out.println(queue.size());
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                    System.out.println(queue.size());
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                    System.out.println(queue.size());
                }
                subList.add(queue.poll().val);
            }
            list.add(subList);
        }
        return list;
    }
}

class Tree {
    int val;
    Tree left;
    Tree right;

    Tree() {
    }

    Tree(int val) {
        this.val = val;
    }

    Tree(int val, Tree left, Tree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
