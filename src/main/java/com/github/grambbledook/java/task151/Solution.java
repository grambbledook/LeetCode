package com.github.grambbledook.java.task151;

public class Solution implements ReverseString {

    private static final char SPACE = ' ';

    private StringBuilder sb = new StringBuilder();

    public String reverseWords(String s) {
        if (s == null || s.length() == 0) return s;

        char[] data = s.toCharArray();
        int l = data.length - 1;
        int r = data.length - 1;

        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] != SPACE) {
                l = i;
                continue;
            }

            if (i < data.length - 1 && data[i] != data[i + 1]) {
                while (l <= r) sb.append(data[l++]);
                sb.append(SPACE);
            }
            r = i - 1;
            l = i - 1;
        }

        while (l >= 0 && l <= r) sb.append(data[l++]);

        return makeString();
    }

    private String makeString() {
        int lastCharacter = sb.length() > 0 && sb.charAt(sb.length() - 1) == SPACE ? sb.length() - 1 : sb.length();
        return sb.substring(0, lastCharacter);
    }
}