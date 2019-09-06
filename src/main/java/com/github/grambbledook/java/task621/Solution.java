package com.github.grambbledook.java.task621;

import java.util.Arrays;

public class Solution {

    private static final char A = 'A';

    public int leastInterval(char[] tasks, int n) {
        if (n == 0) return tasks.length;

        int[] candidates = new int[26];
        for (char c : tasks) candidates[c - A]++;
        Arrays.sort(candidates);

        int idleIterations = candidates[25] - 1;
        int totalIdleSlots = idleIterations * n;
        for (int i = candidates.length - 2; i > 0; i--) {
            if (candidates[i] == 0) break;

            totalIdleSlots -= Math.min(candidates[i], idleIterations);
        }

        return totalIdleSlots > 0 ? tasks.length + totalIdleSlots : tasks.length;
    }
}
