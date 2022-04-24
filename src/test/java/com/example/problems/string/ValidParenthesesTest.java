/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.string;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ValidParenthesesTest {

    private static final ValidParentheses validator = new ValidParentheses();

    @Test
    public void test1() {
        String intput = "[(())[{}][]]";
        assertTrue(validator.isValid(intput));
    }
}
