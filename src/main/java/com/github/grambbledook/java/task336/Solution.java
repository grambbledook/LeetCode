package com.github.grambbledook.java.task336;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPalindrome(words[i], words[j])) result.add(pair(i, j));
                if (isPalindrome(words[j], words[i])) result.add(pair(j, i));
            }
        }

        return result;
    }

    private boolean isPalindrome(String s1, String s2) {
        int l = 0;
        int r = s1.length() + s2.length() - 1;

        while (l < r) {
            char left;
            if (l > s1.length() - 1) left = s2.charAt(l++ - s1.length());
            else left = s1.charAt(l++);

            char right;
            if (r < s1.length()) right = s1.charAt(r--);
            else right = s2.charAt(r-- - s1.length());

            if (left != right) return false;
        }

        return true;
    }

    private List<Integer> pair(int i, int j) {
        Integer[] pair = new Integer[]{i, j};
        return Arrays.asList(pair);
    }

}