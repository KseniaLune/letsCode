package org.example.explore.linkedList;

import java.util.concurrent.RecursiveTask;

/**
 * [1,2,6,3,4,5,6] -> [1,2,3,4,5]
 */
public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode node = new ListNode(7,
            new ListNode(7,
                new ListNode(7,
                    new ListNode(7,
                        new ListNode(7,
                            new ListNode(7,
                                new ListNode(7)))))));
        ListNode res = removeElements(node, 7);
        System.out.println(res);
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null || val == 0) {
            return head;
        }
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null){
            return head;
        }

        ListNode res = head;
        head = head.next;

        ListNode result = res;

        while (head != null) {
            if (head.val == val){
                if (head.next == null){
                    res.next = null;
                    break;
                }
                    head = head.next;
            } else {
                ListNode node = head;
                res.next = node;
                res = res.next;
                head = head.next;
            }

        }

        return result;

    }

    public static class ListNode {
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
}
