/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays;

import java.util.Arrays;

import org.junit.Test;

public class TempTest {

    @Test
    public void test() {
        int[] input = new int[] { 2, 3, 2, 2, 2, 2, 4, 2 };

        int i = 0;
        int prev = input[0];
        while (i < input.length - 1) {
            int curr = input[i];
            input[i] = prev * input[i + 1];
            
            prev = curr;
            i++;
        }

        input[i] *= prev;
        System.out.println(Arrays.toString(input));
    }
}
