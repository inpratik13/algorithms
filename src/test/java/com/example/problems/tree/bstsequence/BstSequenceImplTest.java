/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.tree.bstsequence;

import com.example.problems.tree.Node;

import java.util.List;

import org.junit.Test;

public class BstSequenceImplTest {

    private static final BstSequence seq = new BstSequenceImpl();

    @Test
    public void test() {
        Node<Integer> node = Node.with(2, Node.with(1), Node.with(3));
        List<List<Integer>> output = seq.generate(node);
        System.out.println(output);
    }
}
