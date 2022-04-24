/**
 * (C) VyanTech.com Ltd 2021
 */
package com.example.algorithm.dp.sellofwine;

import java.util.Arrays;

public class SellOfWineImpl implements SellOfWine {

    @Override
    public int[] findSellIndexOrder(int[] stockPerBatch) {
        int[][] dp = new int[stockPerBatch.length][stockPerBatch.length];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        int[][] sell = new int[stockPerBatch.length][stockPerBatch.length];

        findSellIndexOrder(stockPerBatch, dp, sell, 0, stockPerBatch.length - 1);
        return ouput(sell);
    }

    private int[] ouput(int[][] sell) {
        int[] output = new int[sell.length];
        int i = 0, j = output.length - 1;
        int count = 0;
        while (j > i) {
            output[count++] = sell[i][j] == -1 ? ++i : --j;
        }
        return output;
    }

    private static int findSellIndexOrder(int[] stockPerBatch, int[][] dp, int[][] sell, int start, int end) {
        if (dp[start][end] != -1) {
            return dp[start][end];
        }

        int year = stockPerBatch.length - (end - start);
        if (start == end) {
            // System.out.format("You can get max %d for start/end %d\n\n",
            // stockPerBatch[start] * year, start);
            return dp[start][end] = year * stockPerBatch[start];
        }

        int fromEnd = (year * stockPerBatch[end])
                + findSellIndexOrder(stockPerBatch, dp, sell, start, end - 1);
        // System.out.format("Selling from end will result in to %d for start/end
        // %d/%d\n", fromEnd, start, end);

        int fromStart = (year * stockPerBatch[start])
                + findSellIndexOrder(stockPerBatch, dp, sell, start + 1, end);
        // System.out.format("Selling from start will result in to %d for start/end
        // %d/%d\n", fromStart, start, end);

        dp[start][end] = Math.max(fromStart, fromEnd);
        sell[start][end] = fromStart >= fromEnd ? -1 : 1;
        System.out.format("sell[%d][%d]=%d\n", start, end, sell[start][end]);
        // System.out.format("Choosing max $d start/end %d/%d\n\n", dp[start][end],
        // start, end);
        return dp[start][end];
    }

}
