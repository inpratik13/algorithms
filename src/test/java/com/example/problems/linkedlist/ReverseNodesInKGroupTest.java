/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseNodesInKGroupTest {
    private static ReverseNodesInKGroup reverser = new ReverseNodesInKGroup();

    @Test
    public void test() {
        ListNode input =  ListNode.createLinkedList(1,2,3,4);
        ListNode expected = ListNode.createLinkedList(2,1,4,3);
        
        ListNode actual = reverser.reverseKGroup(input, 2);

        assertEquals(expected.toString(), actual.toString());
    }

}
