/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.recursion.hanoi;

import java.util.Deque;
import java.util.LinkedList;

public class TowerOfHanoiImpl implements TowerOfHanoi {

    @Override
    public void moveDisks(Deque<Integer> origin, Deque<Integer> destination) {
        Deque<Integer> buffer = new LinkedList<>();
        moveDisks(origin.size(), origin, buffer, destination);
    }

    private void moveDisks(int n, Deque<Integer> origin, Deque<Integer> buffer, Deque<Integer> destination) {
        if (n == 0)
            return;

        moveDisks(n - 1, origin, destination, buffer);
        moveTop(origin, destination);
        moveDisks(n - 1, buffer, origin, destination);
    }

    private void moveTop(Deque<Integer> origin, Deque<Integer> destination) {
        if (origin.isEmpty())
            return;

        Integer top = origin.pollFirst();
        Integer second = destination.peekFirst();

        if (!destination.isEmpty() && top.intValue() > second.intValue()) {
            throw new IllegalStateException("Can't put " + top + " on " + second);
        }
        destination.offerFirst(top);
    }

}
