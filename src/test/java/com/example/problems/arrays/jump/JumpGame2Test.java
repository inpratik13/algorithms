/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.jump;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JumpGame2Test {

    private static final JumpGame2 game = new JumpGame2();
    
    @Test
    public void test() {
        int actual = game.jump(new int[] {2,3,0,1,4});
        assertEquals(2, actual);
    }
    
    @Test
    public void test2() {
        int actual = game.jump(new int[] {5,9,3,2,1,0,2,3,3,1,0,0});
        assertEquals(3, actual);
    }
}
