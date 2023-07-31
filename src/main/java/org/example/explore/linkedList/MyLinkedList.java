package org.example.explore.linkedList;


public class MyLinkedList {
    Node head;
    int length;

    public class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    public int get(int index) {
        if (index >= length) return -1;

        int counter = 0;
        Node res = head;

        while (counter < index) {
            res = head.next;
            counter++;
        }
        return res.val;

    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = this.head;
        head = node;
        length++;
    }

    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
        } else {
            Node node = new Node(val);
            Node oldTail = head;
            while (oldTail.next != null) {
                oldTail = oldTail.next;
            }
            oldTail.next = node;
            length++;
        }

    }

    public void addAtIndex(int index, int val) {
        if (index > length) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
        } else {
            Node res = new Node(val);
            Node node = head;
            int counter = 1;
            while (counter < index) {
                node = node.next;
                counter++;
            }
            Node nodeNext = node.next;
            node.next = res;
            res.next = nodeNext;

            length++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index >= length) {
            return;
        }
        if (index == 0) {
            length--;
            head = head.next;
        } else {
            int counter = 1;
            Node node = head;
            while (counter < index) {
                node = node.next;
                counter++;
            }
            node.next = node.next.next;
            length--;
        }


    }
}
