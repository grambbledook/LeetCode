package com.github.grambbledook.java.task443;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public int compress(char[] chars) {
        if (chars.length == 0) return 0;

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : chars) {
            Integer count = map.put(c, 1);
            if (count != null) map.put(c, ++count);
        }

        int i = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            chars[i++] = entry.getKey();
            int count = entry.getValue();
            if (count > 1) {
                for (char c : ("" + count).toCharArray())
                    chars[i++] = c;
            }
        }

        return i;

    }
}
