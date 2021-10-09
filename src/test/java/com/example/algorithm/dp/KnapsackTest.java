/**
 * (C) VyanTech.com Ltd 2021
 */
package com.example.algorithm.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnapsackTest {

    private static final MaxValueAlgo algo = new Knapsack();
    
    @Test
    public void test1() {
        int[] values = { 60, 100, 120 };
        int[] costs = { 2, 4, 6 };
        int maxWeight = 10;
        
        assertEquals(220, 
                algo.maxValue(values, costs, maxWeight));
    }
    
    
    @Test
    public void test2() {
        int[] values = { 600, 1000, 1200 };
        int[] costs = { 200, 400, 600 };
        int maxWeight = 3000;
        
        assertEquals(2800, 
                algo.maxValue(values, costs, maxWeight));
    }
}
