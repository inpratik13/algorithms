/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.recursion.hanoi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.IntStream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TowerOfHanoiImplTest {

    TowerOfHanoi algo = new TowerOfHanoiImpl();

    @Test
    public void test1() {
        Deque<Integer> origin = dequeWithDisks(1);
        Deque<Integer> destination = new LinkedList<>();
        algo.moveDisks(origin, destination);

        Deque<Integer> expected = dequeWithDisks(1);
        assertEquals(expected, destination);
    }

    @Test
    public void test2() {
        Deque<Integer> origin = dequeWithDisks(2);
        Deque<Integer> destination = new LinkedList<>();
        algo.moveDisks(origin, destination);

        Deque<Integer> expected = dequeWithDisks(2);
        assertEquals(expected, destination);
    }
    
    @Test
    public void test3() {
        Deque<Integer> origin = dequeWithDisks(3);
        Deque<Integer> destination = new LinkedList<>();
        algo.moveDisks(origin, destination);
        
        Deque<Integer> expected = dequeWithDisks(3);
        assertEquals(expected, destination);
    }
    
    @Test
    public void test4() {
        Deque<Integer> origin = dequeWithDisks(4);
        Deque<Integer> destination = new LinkedList<>();
        algo.moveDisks(origin, destination);
        
        Deque<Integer> expected = dequeWithDisks(4);
        assertEquals(expected, destination);
    }

    @Test
    public void test5() {
        Deque<Integer> origin = dequeWithDisks(5);
        Deque<Integer> destination = new LinkedList<>();
        algo.moveDisks(origin, destination);

        Deque<Integer> expected = dequeWithDisks(5);
        assertEquals(expected, destination);
    }

    private Deque<Integer> dequeWithDisks(int i) {
        Deque<Integer> dq = new LinkedList<>();
        IntStream.range(1, i + 1)
                .forEach(dq::offerLast);
        return dq;
    }
}
