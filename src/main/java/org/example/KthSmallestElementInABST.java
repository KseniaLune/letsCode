package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KthSmallestElementInABST {
    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode four = new TreeNode(4);
        TreeNode two = new TreeNode(2, one, null);
        TreeNode six = new TreeNode(6);
        TreeNode tree = new TreeNode(3, two, four);
        TreeNode root = new TreeNode(5, tree, six);

        System.out.println(kthSmallest(root, 3));
    }

    public static int kthSmallest(TreeNode root, int k) {
        TreeSet<Integer> res = new TreeSet<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);

            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        Object[] objects = res.toArray();
        return (int) objects[k - 1];
    }
    public static int kthSmallestBest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        int count = 0;

        while (!stack.isEmpty() || p != null) {
            if (p != null) {
                stack.push(p);  // Just like recursion
                p = p.left;

            } else {
                TreeNode node = stack.pop();
                if (++count == k) return node.val;
                p = node.right;
            }
        }

        return Integer.MIN_VALUE;
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
