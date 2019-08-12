package com.github.grambbledook.java.task70;

public class Solution implements ClimbingStairs {

    public int climbStairs(int n) {
        if (n == 0) return 0;

        int first = 1;
        int second = 1;

        for (int i = 1; i < n; i++) {
            int tmp = first;
            first = second;
            second = first + tmp;
        }

        return second;
    }

}
