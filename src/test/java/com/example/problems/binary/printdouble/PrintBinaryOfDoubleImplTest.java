/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.binary.printdouble;

import com.example.problems.binary.printdouble.PrintBinaryOfDouble;
import com.example.problems.binary.printdouble.PrintBinaryOfDoubleImpl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrintBinaryOfDoubleImplTest {

    PrintBinaryOfDouble generator = new PrintBinaryOfDoubleImpl();

    @Test
    public void test1() {
        double value = 0.125;
        String binary = generator.asBinaryString(value);

        System.out.println(value + " = " + binary);
        assertEquals("0.001", binary);

    }

    @Test
    public void test2() {
        double value = 1.125;
        String binary = generator.asBinaryString(value);

        System.out.println(value + " = " + binary);
        assertEquals("1.001", binary);

    }

    @Test
    public void test3() {
        double value = 5.125;
        String binary = generator.asBinaryString(value);

        System.out.println(value + " = " + binary);
        assertEquals("101.001", binary);

    }
}
