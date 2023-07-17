package org.example.quest;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1,new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1,new ListNode(3, new ListNode(4)));
        System.out.println(mergeTwoLists(l1,l2).toString());
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null&&list2!=null){
            return list2;
        } else if (list2 == null&&list1!=null) {
            return list1;
        } else if (list1==null&&list2==null){
            return null;
        }
        ListNode listNode = new ListNode();
        return merge(list1,list2,listNode);

    }
    public static ListNode  merge(ListNode list1, ListNode list2, ListNode result){
        result.next = new ListNode();
        if (list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                result.val = list1.val;
                merge(list1.next, list2, result.next);
            } else {
                result.val= list2.val;
                merge(list1, list2.next, result.next);
            }
        } else {
            if (list1 != null) {
                result.val = list1.val;
                result.next = list1.next;
                return result;
            } else if (list2!= null) {
                result.val = list2.val;
                result.next = list2.next;
                return result;
            } else {
                return result;
            }
        }
        return result;
    }

    static class ListNode {
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

        @Override
        public String toString() {
            return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
        }
    }

}
