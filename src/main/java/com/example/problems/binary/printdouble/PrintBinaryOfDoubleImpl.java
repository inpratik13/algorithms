/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.binary.printdouble;

public class PrintBinaryOfDoubleImpl implements PrintBinaryOfDouble {

    @Override
    public String asBinaryString(double number) {
        StringBuilder binary = new StringBuilder();
        
        appendBeforeFraction((long) number, binary);
        appendFraction(number - (long) number, binary);
        
        return binary.toString();
    }

    private void appendBeforeFraction(long number, StringBuilder binary) {
        System.out.println("appendBeforeFraction " + number + " to " + binary);
        binary.append(Long.toBinaryString(number));
    }

    private void appendFraction(double number, StringBuilder binary) {
        System.out.println("appendFraction " + number + " to " + binary);
        binary.append(".");

        while (number > 0) {

            double r = number * 2;
            if (r >= 1) {
                binary.append(1);
                number = r - 1;
            } else {
                binary.append(0);
                number = r;
            }
        }
    }

}
