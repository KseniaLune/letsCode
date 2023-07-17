package org.example.quest;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal {
    public static void main(String[] args) {

        Node node = new Node(1 );
        System.out.println(preorder(node));

    }

    public static List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        result = order(root, result);
        return result;
    }

    private static List<Integer> order(Node root, List<Integer> list) {
        if (root == null) return list;
        list.add(root.val);
        if (root.children==null) return list;
        for (int i = 0; i < root.children.size(); i++) {
            order(root.children.get(i), list);
        }
        return list;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
