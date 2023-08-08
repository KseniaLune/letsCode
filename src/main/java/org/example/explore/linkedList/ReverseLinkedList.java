package org.example.explore.linkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {

        ListNode node = new ListNode(1, new ListNode(2,
            new ListNode(3,
                new ListNode(4, new ListNode(5)))));

        System.out.println(reverseList(node).val);

    }
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode newHead = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;


    }
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
