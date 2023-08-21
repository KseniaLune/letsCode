package org.example.top150;

import org.example.explore.linkedList.RemoveLinkedListElements;

import javax.swing.plaf.PanelUI;

public class PathSum {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1,
            new TreeNode(2,
                new TreeNode(3),
                null),
            null);

        System.out.println(hasPathSum(node, 6));

    }

    public static boolean bestSolutions(TreeNode root, int sum) {
        if (root == null) return false;

        if (root.left == null && root.right == null && sum - root.val == 0) return true;

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);

    }


    public static boolean hasPathSum(TreeNode root, int targetSum) {
        TreeNode node = root;
        if (node == null) {
            return false;
        } else if (node.left == null && node.right == null) {
            if (node.val == targetSum) {
                return true;
            }
            return false;
        }
        int sum = node.val;

        return summing(node.left, sum, targetSum) || summing(node.right, sum, targetSum);


    }

    public static boolean summing(TreeNode root, int sum, int target) {
        sum += root.val;

        if (root.left == null && root.right == null) {
            if (sum == target) {
                return true;
            }
            return false;
        }

        boolean sumLeft = false, sumRight = false;
        if (root.left != null) {
            sumLeft = summing(root.left, sum, target);
        }
        if (root.right != null) {
            sumRight = summing(root.right, sum, target);
        }

        if (sumLeft || sumRight) {
            return true;
        }
        return false;

    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
