package com.github.grambbledook.java.task5.longest.brute;


public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";
        if (s.length() == 1) return s;

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                boolean isPalindromic = isPalindromic(s, i, j);
                if (isPalindromic) {
                    if ((end - start) < (j - i)) {
                        start = i;
                        end = j;
                    }
                }
            }
        }

        return s.substring(start, end + 1);
    }

    private boolean isPalindromic(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}