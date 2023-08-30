package org.example.quest.explore.linkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleII {
    public static void main(String[] args) {

    }
    public ListNode detectCycleWithSet(ListNode head){
        Set<ListNode> set = new HashSet<>();

        ListNode node = head;

        while (node != null && node.next != null){
            set.add(node);
            node = node.next;

            if (set.contains(node)){
                return node;
            }
        }
        return null;
    }

    public ListNode detectCycleWithTwoPointers(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                break;
            }
        }
        if (fast == null || fast.next == null){
            return null;
        }
        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }
        return head;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
