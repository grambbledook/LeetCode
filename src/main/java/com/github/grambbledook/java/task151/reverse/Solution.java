package com.github.grambbledook.java.task151.reverse;

import com.github.grambbledook.java.task151.ReverseString;

public class Solution implements ReverseString {

    private static final char SPACE = ' ';
    private static final String EMPTY = "";

    private char[] data;

    public String reverseWords(String s) {
        if (s == null || s.length() == 0) return s;
        data = s.toCharArray();

        int end = removeWhiteSpaces();

        if (end != -1) {
            reverse(0, end);
            reverseWords(end);

            return makeString(end);
        }

        return EMPTY;
    }

    private int removeWhiteSpaces() {
        int l = -1;
        int r = 0;

        while (r < data.length) {
            if (data[r] != SPACE || (l >= 0 && data[l] != SPACE)) {
                data[++l] = data[r];
            }

            r++;
        }

        if (l > 0 && data[l] == SPACE) l--;
        return l;
    }

    private void reverse(int l, int r) {
        while (l < r) {
            char tmp = data[l];
            data[l] = data[r];
            data[r] = tmp;

            l++;
            r--;
        }
    }

    private void reverseWords(int end) {
        int l = 0;
        int r = 0;

        while ((r <= end)) {
            if (data[r] == SPACE) {
                reverse(l, r - 1);
                l = r + 1;
            }

            r++;
        }

        reverse(l, r - 1);
    }

    private String makeString(int end) {
        return new String(data, 0, end + 1);
    }

}