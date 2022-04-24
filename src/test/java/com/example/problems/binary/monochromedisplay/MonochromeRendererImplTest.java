/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.binary.monochromedisplay;

import org.junit.Test;

public class MonochromeRendererImplTest {

    private static final int BITS_IN_BYTE = 8;
    private final MonochromeRenderer renderer = new MonochromeRendererImpl();

    @Test
    public void test() {
        final int width = 32;
        final int height = 32;
        byte[] buffer = newBuffer(width, height);

        renderer.render(buffer, height, 5, 15, 10);

        print(buffer, width);
    }

    private byte[] newBuffer(int width, int height) {
        return new byte[(width / BITS_IN_BYTE) * height];
    }

    private void print(byte[] buffer, int screenWitdh) {
        final int BYTES_IN_ROW = (screenWitdh / BITS_IN_BYTE);

        for (int h = 0; h < buffer.length / BYTES_IN_ROW; h++) {
            for (int w = 0; w < BYTES_IN_ROW; w++) {

                byte toPrint = buffer[(BYTES_IN_ROW * h) + w];
                for (int b = (int) Math.pow(2, BITS_IN_BYTE); b != 0; b >>= 1) {
                    System.out.print(toPrint & b);
                }
                System.out.print(",");

            }
            System.out.println();
        }
    }
}
