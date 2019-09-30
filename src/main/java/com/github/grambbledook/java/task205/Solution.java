package com.github.grambbledook.java.task205;


import java.util.Map;
import java.util.HashMap;

public class Solution {

    public boolean isIsomorphic(String left, String right) {
        if (left == null || right == null) return false;
        else if (left.length() != right.length()) return false;

        Map<Character, Character> lMap = new HashMap<>();
        Map<Character, Character> rMap = new HashMap<>();

        for (int i = 0; i < left.length(); i++) {
            char l = left.charAt(i);
            char r = right.charAt(i);

            Character lMapping = lMap.put(l, r);
            Character rMapping = rMap.put(r, l);

            if (lMapping != null && lMapping != r) return false;
            if (rMapping != null && rMapping != l) return false;
        }

        return true;
    }

}
