/**
 * (C) VyanTech.com Ltd 2021
 */
package com.example.algorithm.dp.sellofwine;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SellOfWineImplTest {

    private static final SellOfWine algo = new SellOfWineImpl();

    @Test
    public void test1() {
        int[] stocks = { 2, 4, 6, 2, 5 };
        int[] output = algo.findSellIndexOrder(stocks);
        
        System.out.println(Arrays.toString(output));
        //assertEquals({}, output);

    }
}
