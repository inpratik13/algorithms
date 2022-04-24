/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.superseq;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ShortestSuperSequence {

    public Range find(int[] from, int[] elements) {
        final CountLookup lookup = new CountLookup(elements);

        Range bestRange = null;

        for (int i = 0; i < from.length; i++) {
            lookup.seenAt(from[i], i);
            if (lookup.isFulfilled()) {
                Range range = lookup.range();
                if (bestRange == null || bestRange.isLongerThan(range)) {
                    bestRange = range;
                }
                lookup.movingFrom(from[i], i);
            }
        }

        return bestRange;
    }

    private static class CountLookup {
        private final Set<Integer> elements = new HashSet<>();
        private final Map<Integer, Integer> lastIndexes = new HashMap<>();
        private Range range = null;

        public CountLookup(int[] elems) {
            for (int elem : elems)
                elements.add(elem);
        }

        public void movingFrom(int val, int index) {

        }

        public Range range() {
            if (range == null) {
                int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
                for (Integer index : lastIndexes.values()) {
                    min = Math.min(min, index);
                    max = Math.max(max, index);
                }
                range = new Range(min, max);
            }

            return range;
        }

        public boolean isFulfilled() {
            return elements.size() == lastIndexes.size();
        }

        public void seenAt(int val, int index) {
            if (elements.contains(val)) {
                lastIndexes.put(val, index);
                range = null;
            }
        }
    }

    public static class Range {
        public final int left, right;

        public Range(int left, int right) {
            this.left = left;
            this.right = right;
        }

        public int length() {
            return right - left + 1;
        }

        public boolean isLongerThan(Range r) {
            return length() > r.length();
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", left, right);
        }

    }
}
