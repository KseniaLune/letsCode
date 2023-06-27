package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        TreeNode treeNode = sortedArrayToBST(nums);

        treeNode.node();
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        TreeNode treeNode = added(nums, 0, nums.length - 1)
        ;

        return treeNode;
    }

    private static TreeNode added(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode midNode = new TreeNode(nums[mid]);
        midNode.left = added(nums, left, mid - 1);
        midNode.right = added(nums, mid + 1, right);

        return midNode;
    }
}

class TreeNode {
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

    public void node() {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this);

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            System.out.println(node.val);

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }

        }
    }
}