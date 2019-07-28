package com.github.grambbledook.java.task3;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;

        int max = 0;

        int length = s.length();
        Set<Character> state = new HashSet<>();
        while (l < length && r < length) {

            if (!state.contains(s.charAt(l))) {
                state.add(s.charAt(l++));
                max = Math.max(max, state.size());
            } else {
                state.remove(s.charAt(r++));
            }
        }
        return Math.max(max, state.size());
    }

}