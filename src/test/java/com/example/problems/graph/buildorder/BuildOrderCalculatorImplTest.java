/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.graph.buildorder;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuildOrderCalculatorImplTest {

    BuildOrderCalculator calculator = new BuildOrderCalculatorImpl();

    @Test
    public void testSample() {
        char[][] input = new char[][] {
                new char[] { 'c', 'f' },
                new char[] { 'b', 'f' },
                new char[] { 'a', 'f' },
                new char[] { 'a', 'c' },
                new char[] { 'a', 'b' },
                new char[] { 'e', 'a' },
                new char[] { 'e', 'b' },
                new char[] { 'g', 'd' }
        };

        char[] output = calculator.calculate(input);
        char[] expected = new char[] { 'd', 'f', 'b', 'c', 'g', 'a', 'e' };

        assertEquals(Arrays.toString(expected), Arrays.toString(output));
    }
}
