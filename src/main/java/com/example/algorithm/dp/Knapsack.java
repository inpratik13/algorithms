/**
 * (C) VyanTech.com Ltd 2021
 */
package com.example.algorithm.dp;

public class Knapsack implements MaxValueAlgo {

    @Override
    public int maxValue(int[] values, int[] costs, int budget) {
        int costGCD = calcGCD(budget, costs);
        budget = budget / costGCD;
        for (int i = 0; i < costs.length; i++) {
            costs[i] = costs[i] / costGCD;
        }
        
        //System.out.format("%s: %S\n", "Values", Arrays.toString(values));
        //System.out.format("%s: %S\n", "Costs", Arrays.toString(costs));
        //System.out.format("%s: %d\n", "Budget", budget);

        int dp[][] = new int[values.length + 1][budget + 1];

        for (int r = 1; r <= values.length; r++) {
            for (int c = 1; c <= budget; c++) {

                dp[r][c] = c < costs[r - 1]
                        ? dp[r - 1][c]
                        : Math.max(
                                dp[r - 1][c],
                                values[r - 1] + dp[r - 1][c - costs[r - 1]]);

            }
        }

        return dp[values.length][budget];
    }

    public int calcGCD(int budget, int[] costs) {
        int gcd = budget;
        for (int cost : costs) {
            gcd = calcGCD(gcd, cost);
        }
        return gcd;
    }

    public int calcGCD(int a, int b) {
        if (b == 0)
            return a;
        return calcGCD(b, a % b);
    }

}
