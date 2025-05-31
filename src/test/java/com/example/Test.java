/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example;

public class Test {
    
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(5);
        node.next.next = new ListNode(4);
        node.next.next.next = new ListNode(3);
        
        Test test = new Test();
        test.print(node);
        
        test.sortList(node);
        
        test.print(node);
    }
    
    public ListNode sortList(ListNode first) {
        if(first == null || first.next == null) return first;
        
        ListNode second = getSecondPart(first);
        System.out.println("Dividing at " + first.val);
        System.out.println("Second at " + (second == null ? "null" : second.val));
        System.out.println("");
        
        first = sortList(first);
        second = sortList(second);

        return merge(first, second);
    }

    private void print(ListNode node){
        while(node != null){
            System.out.print(" -> " + node.val);
            node = node.next;
        }
        System.out.println(" -> " + null);
    }

    private ListNode merge(ListNode first, ListNode second){
        ListNode sentinel = new ListNode(0);
        ListNode tail = sentinel;

        while(first != null && second != null){
            if(first.val < second.val) {
                tail.next = first;
                first = first.next;
            } else {
                tail.next = second;
                second = second.next;
            }
            tail = tail.next;
        }

        if(first != null)
            tail.next = first;
        if(second != null)
            tail.next = second;

        return sentinel.next;
    }

    private ListNode getSecondPart(ListNode fast){
        ListNode slow = fast;
        if(fast != null) fast = fast.next;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode second = slow.next;
        slow.next = null;
        return second;
    }

    static class ListNode {
        public int val;
        public ListNode next;
        
        public ListNode(int x) { val = x; next = null; }
        @Override
        public String toString() { return String.valueOf(val);}
    }
}
