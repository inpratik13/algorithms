package com.example.algorithm.sort;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class InsertionSortTest {

	private int[] input;
	private int[] expectedOutput;

	public InsertionSortTest(int[] input, int[] expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Test
	public void test() {
		Sort algo = new InsertionSort();
		algo.sort(input);
		assertArrayEquals(expectedOutput, input);
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { new int[] { 8, 5, 3, 2 }, new int[] { 2, 3, 5, 8 } },
				{ new int[] { 6, 10, 3, 1, 5 }, new int[] { 1, 3, 5, 6, 10 } },
				{ new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 } }, { new int[] {}, new int[] {} },
				{ new int[] { 2 }, new int[] { 2 } } });
	}

}
