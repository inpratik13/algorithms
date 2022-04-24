/**
 * (C) VyanTech.com Ltd 2021
 */
package com.example.algorithm.dp.setcover;

public interface SetCover {

    public ElementSet[] chooseSets(ElementSet[] elements, int[] universe);

    class ElementSet {
        public final int[] elements;
        public final int cost;

        public ElementSet(int[] elements, int cost) {
            super();
            this.elements = elements;
            this.cost = cost;
        }

        public int[] getElements() {
            return elements;
        }

        public int getCost() {
            return cost;
        }

    }
}
