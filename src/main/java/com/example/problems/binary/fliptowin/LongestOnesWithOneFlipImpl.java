/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.binary.fliptowin;

public class LongestOnesWithOneFlipImpl implements LongestOnesWithOneFlip {
    private final int maskLast = 1;

    @Override
    public int find(int input) {
        int maxLength = 0;

        int lastConseq = 0;
        int currentConseq = 0;

        while (input > 0) {
            if ((input & maskLast) == 1) {
                currentConseq++;
            } else {
                maxLength = Math.max(maxLength, currentConseq + lastConseq + 1);
                lastConseq = currentConseq;
                currentConseq = 0;
            }

            input >>= 1;
        }

        maxLength = Math.max(maxLength, currentConseq + lastConseq + 1);
        return maxLength;
    }

}
