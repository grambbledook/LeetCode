package com.github.grambbledook.java.task5.longest;


public class Solution implements LongestPalindromic {

    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";
        if (s.length() == 1) return s;
        if (s.length() == 2) {
            if (s.charAt(0) == s.charAt(1)) return s;
            else return s.substring(0, 1);
        }

        int[] palindrome = new int[]{0, 0};
        for (int i = 0; i < s.length(); i++) {

            int[] tmp = longestPalindrome(s, i, i + 1);
            if (length(tmp) > length(palindrome)) palindrome = tmp;

            tmp = longestPalindrome(s, i, i);
            if (length(tmp) > length(palindrome)) palindrome = tmp;
        }

        return s.substring(palindrome[0], palindrome[1] + 1);
    }

    private int[] longestPalindrome(String s, int i, int j) {
        int l = i;
        int r = i;

        int offset = 0;
        while (i - offset >= 0 && j + offset < s.length()) {
            char left = s.charAt(i - offset);
            char right = s.charAt(j + offset);
            if (left == right) {
                l = i - offset;
                r = j + offset;
            } else break;

            offset++;
        }

        return new int[]{l, r};
    }

    private int length(int[] palindrom) {
        return palindrom[1] - palindrom[0];
    }

}