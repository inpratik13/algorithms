/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.algorithm.graph.maxflow;

import com.example.algorithm.graph.EdgeInfo;

public class EdgeCapacity implements EdgeInfo {
    private static final int DEFAULT_CAPACITY = 0;

    private int flow;
    private final int capacity;

    private EdgeCapacity(int flow, int capacity) {
        this.flow = flow;
        this.capacity = capacity;
    }

    public int flow() {
        return flow;
    }

    public void flow(int flow) {
        this.flow = flow;
    }

    public int capacity() {
        return capacity;
    }

    public static EdgeCapacity of(int capacity) {
        return of(DEFAULT_CAPACITY, capacity);
    }

    public static EdgeCapacity of(int flow, int capacity) {
        return new EdgeCapacity(flow, capacity);
    }

}
