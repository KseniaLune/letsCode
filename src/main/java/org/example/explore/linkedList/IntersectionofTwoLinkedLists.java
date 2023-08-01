package org.example.explore.linkedList;

public class IntersectionofTwoLinkedLists {
    public static void main(String[] args) {

        ListNode nodeA = new ListNode(3);
        ListNode nodeB = new ListNode(2);
        nodeB.next = nodeA;

        System.out.println(getIntersectionNodeTheBest(nodeA, nodeB).val);


    }

    public static ListNode getIntersectionNodeTheBest(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            if (a == null){
                a = headB;
            } else {
                a = a.next;
            }

            if (b == null){
                b = headA;
            } else {
                b = b.next;
            }
        }

        return a;
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == headB) return headA;

        ListNode tailA = headA;
        ListNode tailB = headB;
        int indexA = 0, indexB = 0;

        while (tailA != null && tailA.next != null || tailB != null && tailB.next != null) {
            if (tailA != null && tailA.next != null) {
                tailA = tailA.next;
                indexA++;
            } else {
                tailB = tailB.next;
                indexB++;
            }
        }


        if (indexA > indexB) {
            int diff = indexA - indexB;

            while (diff > 0) {
                headA = headA.next;
                diff--;
            }
        } else if (indexB > indexA) {
            int diff = indexB - indexA;

            while (diff > 0) {
                headB = headB.next;
                diff--;
            }
        }
        while (headA != null) {

            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;

        }

        return null;

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
