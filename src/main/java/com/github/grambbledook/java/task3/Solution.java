package com.github.grambbledook.java.task3;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        int max = 0;

        int l = 0;

        Map<Character, Integer> state = new HashMap<>();
        for (int r = 0; r < s.length(); r++) {

            char key = s.charAt(r);
            if (state.containsKey(key)) l = Math.max(state.get(key), l);

            max = Math.max(max, r - l + 1);
            state.put(key, r + 1);
        }

        return max;
    }

}