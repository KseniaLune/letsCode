package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode twentySix = new TreeNode(26, one, null);
        TreeNode twentyNine = new TreeNode(29);
        TreeNode twentyEight = new TreeNode(28, null, twentyNine);
        TreeNode three = new TreeNode(3, null, twentySix);
        TreeNode fifteen = new TreeNode(15, null, twentyEight);
        TreeNode seven = new TreeNode(7, fifteen, null);
        TreeNode twentyFive = new TreeNode(25);
        TreeNode four = new TreeNode(4, null, seven);
        TreeNode thirtyFour = new TreeNode(34, three, null);
        TreeNode eight = new TreeNode(8);
        TreeNode six = new TreeNode(6, thirtyFour, twentyFive);
        TreeNode two = new TreeNode(2, six, eight);
        TreeNode root = new TreeNode(0, two, four);

//        TreeNode root = new TreeNode(1, null, new TreeNode(2));
        System.out.println(maxDepthReverse(root));
    }

    public static int maxDepthReverse(TreeNode root) {
        if (root == null) return 0;
        int leftMaxDepth = maxDepthReverse(root.left);
        int rightMaxDepth = maxDepthReverse(root.right);
        return leftMaxDepth > rightMaxDepth ? leftMaxDepth + 1 : rightMaxDepth + 1;
    }
}

class TreeNode1 {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode1() {
    }

    TreeNode1(int val) {
        this.val = val;
    }

    TreeNode1(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
