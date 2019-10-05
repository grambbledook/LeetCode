package com.github.grambbledook.java.task168;

public class Solution {

    private static final int alphabet = 26;

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int offset = computeOffset(n);
            sb.append(toSymbol(offset));
            n = (n - offset) / alphabet;
        }

        return sb.reverse().toString();
    }

    private int computeOffset(int n) {
        int offset = n % alphabet;

        return offset == 0 ? alphabet : offset;
    }

    private char toSymbol(int offset) {
        return (char) ('A' + offset - 1);
    }
}
