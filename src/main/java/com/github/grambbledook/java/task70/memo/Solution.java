package com.github.grambbledook.java.task70.memo;

import com.github.grambbledook.java.task70.ClimbingStairs;

import java.util.Arrays;

public class Solution implements ClimbingStairs {

    private int[] cache;

    public int climbStairs(int n) {
        if (n == 0) return 0;
        initCache(n);

        return climbStairs0(n);
    }

    private void initCache(int n) {
        cache = new int[n + 1];
        if (n >= 2) Arrays.fill(cache, 2, n + 1, -1);
        cache[0] = 1;
        cache[1] = 1;
    }

    private int climbStairs0(int n) {
        if (cache[n] != -1) return cache[n];

        cache[n] = climbStairs0(n - 1) + climbStairs0(n - 2);
        return cache[n];
    }

}
