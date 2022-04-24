/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.binary.monochromedisplay;

public class MonochromeRendererImpl implements MonochromeRenderer {
    private static final int BITS_IN_BYTE = 8;

    @Override
    public void render(byte[] buffer, int screenWitdh, int x1, int x2, int y) {
        final int BYTES_IN_ROW = (screenWitdh / BITS_IN_BYTE);
        final int height = buffer.length / BYTES_IN_ROW;

        int bitToSet = (y % BITS_IN_BYTE) - BITS_IN_BYTE;
        byte mask = (byte) (1 << (bitToSet - 1));

        int i = ((x1 - 1) * BYTES_IN_ROW) + (y / BYTES_IN_ROW);
        while (i < x2) {
            
        }
    }

}
