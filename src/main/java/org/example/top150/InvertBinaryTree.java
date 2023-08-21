package org.example.top150;

public class InvertBinaryTree {
    public static void main(String[] args) {

    }

    public static TreeNode invertTree(TreeNode root) {
        TreeNode node = root;
        return reverse(node);
    }

    public static TreeNode reverse(TreeNode root) {
        if (root == null) {
            return root;
        }
        if (root.left != null && root.right != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            reverse(root.left);
            root.right = temp;
            reverse(root.right);
        } else if (root.left != null) {
            root.right = root.left;
            root.left = null;
            reverse(root.right);
        } else {
            root.left = root.right;
            root.right = null;
            reverse(root.left);
        }
        return root;

    }

    class TreeNode {
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
