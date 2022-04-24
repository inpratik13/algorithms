/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.indexof;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IndexOfTest {

    private static IndexOf indexer = new IndexOf();

    private final String haystack;
    private final String needle;
    private final Integer output;

    public IndexOfTest(String haystack, String needle, Integer output) {
        this.haystack = haystack;
        this.needle = needle;
        this.output = output;
    }

    @Test
    public void test() {
        final int actual = indexer.indexOf(haystack, needle);
        assertEquals(output.intValue(), actual);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> primeNumbers() {
        return Arrays.asList(new Object[][] {
                { "mississippi", "pi", 9 },
                { "hello", "ll", 2 },
                { "aaaaa", "bba", -1 },
                { "", "", 0 }
        });
    }
}
