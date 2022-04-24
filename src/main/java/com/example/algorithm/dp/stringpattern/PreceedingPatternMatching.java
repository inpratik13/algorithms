/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.algorithm.dp.stringpattern;

public class PreceedingPatternMatching {
    private static final char STAR = '*';
    private static final char DOT = '.';

    public boolean isMatch(String s, String p) {
        final int sl = s.length();
        final int pl = p.length();

        boolean[][] dp = new boolean[sl + 1][pl + 1];
        dp[0][0] = true;

        int index = 1;
        while (index < pl) {
            if (p.charAt(index) == STAR) {
                dp[0][index + 1] = dp[0][index] || dp[0][index - 1];
            }
            index++;
        }

        for (int si = 1; si <= sl; si++) {
            char lastPatternChar = STAR;

            for (int pi = 1; pi <= pl; pi++) {
                char sc = s.charAt(si - 1);
                char pc = p.charAt(pi - 1);

                if (pc == STAR) {
                    dp[si][pi] = ((sc == lastPatternChar || lastPatternChar == DOT)
                            && (dp[si - 1][pi] || dp[si - 1][pi - 2])) || dp[si][pi - 2];

                } else if (sc == pc || pc == DOT) {
                    dp[si][pi] = dp[si - 1][pi - 1];
                }

                lastPatternChar = pc;
            }
        }

        printDp(s, p, dp);

        return dp[sl][pl];
    }

    private void printDp(String s, String p, boolean[][] dp) {
        System.out.print("\t \t");
        for (char pc : p.toCharArray()) {
            System.out.print(pc + "\t");
        }

        System.out.print("\n\t");
        for (boolean dpc : dp[0]) {
            System.out.print(bool(dpc) + "\t");
        }

        for (int si = 0; si < s.length(); si++) {
            System.out.print("\n" + s.charAt(si) + "\t");
            System.out.print(bool(dp[si + 1][0]) + "\t");
            for (int pi = 0; pi < p.length(); pi++) {
                System.out.print(bool(dp[si + 1][pi + 1]) + "\t");
            }
        }

    }

    private String bool(boolean b) {
        return b ? "T" : ".";
    }

}