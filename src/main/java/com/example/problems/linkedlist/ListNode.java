/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.linkedlist;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public String toString() {
        return val + (next == null ? "" : (", " + next.toString()));
    }

    public static ListNode createLinkedList(int... items) {
        ListNode head = null;

        for (int i = items.length - 1; i >= 0; i--) {
            head = new ListNode(items[i], head);
        }

        return head;
    }

}
