package com.example.algorithm.search;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class InterpolationSearchTest {

	private int[] input;
	private int element;
	private int expectedOutput;

	public InterpolationSearchTest(int[] input, int element, int expectedOutput) {
		this.input = input;
		this.element = element;
		this.expectedOutput = expectedOutput;
	}

	@Test
	public void test() {
		Search algo = new InterpolationSearch();
		assertEquals(expectedOutput, algo.search(input, element));
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { new int[] { 1, 2, 3 }, 2, 1 }, { new int[] { 1, 2, 3, 4 }, 3, 2 },
				{ new int[] { 1, 2, 3 }, 0, -1 }, { new int[] {}, 1, -1 } });
	}

}
