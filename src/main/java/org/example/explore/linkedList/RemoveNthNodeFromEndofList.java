package org.example.explore.linkedList;

public class RemoveNthNodeFromEndofList {
    public static void main(String[] args) {
//        ListNode node = new ListNode(1,
//            new ListNode(2,
//                new ListNode(3,
//                    new ListNode(4,
//                        new ListNode(5)))));
        ListNode node = new ListNode(1);

        System.out.println(removeNthFromEndFirstTry(node, 1));
    }

    public ListNode removeNthFromEndTheBest(ListNode head, int n) {

        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;

        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }

    public static ListNode removeNthFromEndFirstTry(ListNode head, int n) {
        ListNode res = head;
        ListNode node = head;
        int length = 0;
        while (node != null) {
            node = node.next;
            length++;
        }
        length = length - n - 1;
        if (length < 0) {
            return head.next;
        }
        while (length > 0) {
            head = head.next;
            length--;
        }
        if (head == res && head.next.next != null) {
            res.next = head.next.next;
        } else if (head != res && head.next.next != null) {
            head.next = head.next.next;
        } else if (head == res && head.next.next == null) {
            res.next = null;
        } else if (head != res && head.next.next == null) {
            head.next = null;
        }


        return res;
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
