/**
 * (C) VyanTech.com Ltd 2022
 */
package com.example.problems.arrays.indexof;

public class IndexOf {
    public int indexOf(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;

        final int hl = haystack.length(), nl = needle.length();
        int hi = 0, ni = 0;

        while (hi < hl) {
            if (haystack.charAt(hi) == needle.charAt(ni)) {
                if (ni == nl - 1) {
                    return hi - ni;
                }
                ni++;
            } else if (ni != 0) {
                hi = hi - ni;
                ni = 0;

                if (hi > hl - needle.length()) {
                    return -1;
                }
            }

            hi++;
        }

        return -1;
    }
}
