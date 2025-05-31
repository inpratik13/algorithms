/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.algorithm.graph.maxflow;

import com.example.algorithm.graph.Graph;

import org.junit.Test;

public class FordFulkersonTest {

    @Test
    public void testBookAssignments() {
        final int START = 0;
        
        Graph.Builder.newInstance()
            .addEdge(0, 1, EdgeCapacity.of(2))
            .build();
    }
}
