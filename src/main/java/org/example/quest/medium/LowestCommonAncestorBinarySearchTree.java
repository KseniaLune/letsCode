package org.example.quest.medium;

public class LowestCommonAncestorBinarySearchTree {
    public TreeNodeL lowestCommonAncestor(TreeNodeL root, TreeNodeL p, TreeNodeL q) {
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }
}
class TreeNodeL {
    int val;
    TreeNodeL left;
    TreeNodeL right;

    TreeNodeL() {
    }

    TreeNodeL(int val) {
        this.val = val;
    }

    TreeNodeL(int val, TreeNodeL left, TreeNodeL right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
