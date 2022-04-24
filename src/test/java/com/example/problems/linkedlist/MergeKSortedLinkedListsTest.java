/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeKSortedLinkedListsTest {

    private static MergeKSortedLinkedLists merger = new MergeKSortedLinkedLists();

    @Test
    public void test() {
        ListNode[] nodes = new ListNode[3];
        nodes[0] = ListNode.createLinkedList(1, 4, 5);
        nodes[1] = ListNode.createLinkedList(1, 3, 4);
        nodes[2] = ListNode.createLinkedList(2, 6);

        ListNode expected = ListNode.createLinkedList(1, 1, 2, 3, 4, 4, 5, 6);
        ListNode actual = merger.mergeKLists(nodes);

        assertEquals(expected.toString(), actual.toString());
    }

}
