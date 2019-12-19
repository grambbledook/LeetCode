package com.github.grambbledook.java.task151.another;

import com.github.grambbledook.java.task151.ReverseString;

public class Solution implements ReverseString {
    private static final char SPACE = ' ';

    public String reverseWords(String s) {
        int n = s.length();

        char[] result = s.toCharArray();
        reverseEach(n, result);
        reverse(result, 0, n - 1);
        int end = compress(result, 0, n);

        return new String(result, 0, end);
    }

    private void reverseEach(int n, char[] chars) {
        int l = 0;
        for (int r = l + 1; r < n; r++) {
            if (chars[r] == SPACE) {
                reverse(chars, l, r - 1);
                l = r + 1;
            } else if (r == n - 1) {
                reverse(chars, l, n - 1);
            }
        }
    }

    private void reverse(char[] chars, int l, int r) {
        while (l < r) {
            char tmp = chars[l];
            chars[l] = chars[r];
            chars[r] = tmp;
            l++;
            r--;
        }
    }

    private int compress(char[] chars, int start, int end) {
        int r = start;
        for (int i = 0; i < end; i++) {
            if (chars[i] != SPACE) {
                r = i;
                break;
            }
        }

        int l = start;
        while (r < end) {
            if (chars[r] != SPACE) {
                chars[l++] = chars[r];
            } else if (r > 0 && chars[r - 1] != SPACE) {
                chars[l++] = SPACE;
            }
            r++;
        }

        if (l == 0) return 0;
        else if (chars[l - 1] == SPACE) return l - 1;
        else return l;
    }


}
