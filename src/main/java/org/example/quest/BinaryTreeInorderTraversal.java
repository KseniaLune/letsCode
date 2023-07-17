package org.example.quest;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1,null,new TreeNode(2,new TreeNode(3),null));
//        TreeNode treeNode = new TreeNode();
//        TreeNode treeNode = new TreeNode(1);
        System.out.println(inorderTraversal(treeNode));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                result.add(stack.peek().val);
                root = stack.pop().right;
            }
        }
        return result;
    }

    public List<Integer> inorderTraversalBest(TreeNode root) {
        List <Integer> result = new ArrayList<>();
        preorder(root,result);
        return result;
    }
    static public List <Integer> preorder(TreeNode root, List<Integer> nums) {
        if (root == null) return null;

        preorder(root.left, nums);
        nums.add(root.val);
        preorder(root.right, nums);
        return nums;
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
