/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.waves;

public class SignBasedWaveFormer implements WaveFormer {

    @Override
    public void format(int[] input) {
        int[] aux = new int[input.length];
        int auxI = 0;
        int positiveI = 0, negativeI = 0;

        while (positiveI < input.length && negativeI < input.length) {
            while (positiveI < input.length && input[positiveI] < 0) {
                positiveI++;
            }
            while (negativeI < input.length && input[negativeI] >= 0) {
                negativeI++;
            }

            if (positiveI < input.length && negativeI < input.length) {
                aux[auxI++] = input[negativeI++];
                aux[auxI++] = input[positiveI++];
            }
        }

        while (positiveI < input.length) {
            if (input[positiveI] >= 0) {
                aux[auxI++] = input[positiveI];
            }
            positiveI++;
        }
        while (negativeI < input.length) {
            if (input[negativeI] < 0) {
                aux[auxI++] = input[negativeI];
            }
            negativeI++;
        }

        for (int i = 0; i < input.length; i++) {
            input[i] = aux[i];
        }

    }

}
