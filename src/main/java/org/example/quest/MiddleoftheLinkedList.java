package org.example.quest;

public class MiddleoftheLinkedList {
    public static void main(String[] args) {

    }
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
