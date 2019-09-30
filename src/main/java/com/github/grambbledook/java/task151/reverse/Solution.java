package com.github.grambbledook.java.task151.reverse;

import com.github.grambbledook.java.task151.ReverseString;

public class Solution implements ReverseString {

    private static final char SPACE = ' ';
    private static final String EMPTY = "";

    private int end;
    private char[] data;

    public String reverseWords(String s) {
        if (s == null || s.length() == 0) return s;
        data = s.toCharArray();

        removeWhiteSpaces();

        if (end != -1) {
            reverse(0, end);
            reverseWords();

            return makeString();
        }

        return EMPTY;
    }

    private void removeWhiteSpaces() {
        int l = -1;
        int r = 0;

        while (r < data.length) {
            if (data[r] != SPACE || (l >= 0 && data[l] != SPACE)) {
                data[++l] = data[r];
            }

            r++;
        }

        if (l > 0 && data[l] == SPACE) l--;
        end = l;
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

    private void reverseWords() {
        int l = 0;
        int r = 0;

        while (r <= end) {
            if (data[r] == SPACE) {
                reverse(l, r - 1);
                l = r + 1;
            }

            r++;
        }

        reverse(l, r - 1);
    }

    private String makeString() {
        return new String(data, 0, end + 1);
    }

}