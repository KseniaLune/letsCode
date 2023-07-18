package org.example.quest.easy;

import java.util.Stack;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode();

        ListNode listNode1 = reverseList(listNode);

            System.out.println(listNode1.val+" "+
                listNode1.next.val);

    }

    public static ListNode reverseList(ListNode head) {
        if (head==null|| head.next==null) return null;
        ListNode node = new ListNode();
        Stack<Integer> stack = new Stack<>();
        reverse(head, stack);
        return add(node, stack);
    }

    private static Stack<Integer> reverse(ListNode head, Stack<Integer> stack) {
        stack.push(head.val);
        if (head.next != null) {
            reverse(head.next, stack);
        }
        return stack;
    }
    private static ListNode add (ListNode head, Stack<Integer>stack){
        head.val = stack.pop();
        if (!stack.isEmpty()){
            head.next = new ListNode();
            add(head.next, stack);
        }
        return head;
    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}