/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.linkedlist;

public class MergeKSortedLinkedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNodeTracker tracker = new ListNodeTracker();

        for (ListNode list : lists) {
            tracker.moveToHead();
            merge(tracker, list);
        }

        return tracker.head();
    }

    private static void merge(ListNodeTracker tracker, ListNode from) {
        while (tracker.hasMore() && from != null) {
            if (tracker.value() > from.val) {
                tracker.insert(from.val);
                from = from.next;
            } else {
                tracker.moveToNext();
            }
        }

        while (from != null) {
            tracker.moveToNext();
            tracker.insert(from.val);
            from = from.next;
        }
    }

    private static class ListNodeTracker {
        private ListNode head;
        private ListNode pointer;
        private ListNode previous;

        void moveToHead() {
            pointer = head;
            previous = null;
        }

        ListNode head() {
            return head;
        }

        boolean hasMore() {
            return pointer != null;
        }

        int value() {
            return pointer.val;
        }

        void moveToNext() {
            if(pointer != null) {
                previous = pointer;
                pointer = pointer.next;
            }
        }

        void insert(int valToInsert) {
            if (previous == null) {
                if (head == null) {
                    head = new ListNode(valToInsert);
                    pointer = head;
                } else {
                    previous = new ListNode(valToInsert, head);
                    head = previous;
                }
            } else {
                previous.next = new ListNode(valToInsert, pointer);
                previous = previous.next;
            }
        }

        public String toString() {
            return head == null ? "" : head.toString();
        }
    }
}
