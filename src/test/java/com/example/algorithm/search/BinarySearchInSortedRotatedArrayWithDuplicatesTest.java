/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.algorithm.search;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BinarySearchInSortedRotatedArrayWithDuplicatesTest {

    private static final BinarySearchInSortedRotatedArrayWithDuplicates search = new BinarySearchInSortedRotatedArrayWithDuplicates();
    
    @Test
    public void test1() {
        int[] input = {2,5,6,0,0,1,2};
        int output = search.search(input, 0);
        assertTrue(output != -1);
    }
    
    @Test
    public void test2() {
        int[] input = {2,5,6,0,0,1,2};
        int output = search.search(input, 5);
        assertTrue(output != -1);
    }
    
    @Test
    public void test3() {
        int[] input = {2,5,6,0,0,1,2};
        int output = search.search(input, 3);
        assertTrue(output == -1);
    }
    
    @Test
    public void test4() {
        int[] input = {1,0,1,1,1};
        int output = search.search(input, 0);
        assertTrue(output != -1);
    }
}
