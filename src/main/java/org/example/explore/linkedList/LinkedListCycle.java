package org.example.explore.linkedList;

public class LinkedListCycle {
    public static void main(String[] args) {

    }
    public static boolean hasCycle(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;

        while (fastNode != null && fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;

            if (slowNode == fastNode){
                return true;
            }
        }
        return false;
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
