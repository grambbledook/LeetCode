package com.github.grambbledook.java.task921;

public class Solution {

    private static final char LEFT = '(';

    public int minAddToMakeValid(String S) {

        int left = 0;
        int right = 0;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (c == LEFT) left++;
            else {
                if (left == 0) right++;
                else left--;
            }
        }

        return left + right;
    }
}
