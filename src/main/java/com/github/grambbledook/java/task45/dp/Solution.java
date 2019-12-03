package com.github.grambbledook.java.task45.dp;

import com.github.grambbledook.java.task45.JumpGame2;

public class Solution implements JumpGame2 {

    private static final int DEAD_END = -1;

    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;

        int position = n;
        int[] dp = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] >= n - position) dp[i] = 1;
            else {
                int steps = -1;

                for (int j = nums[i]; j > 0; j--) {
                    int jumps = dp[i + j];
                    if (jumps != DEAD_END) steps = steps == DEAD_END ? jumps : Math.min(steps, jumps);
                }

                dp[i] = steps == DEAD_END ? DEAD_END : steps + 1;
            }
            position--;
        }

        return dp[0];
    }

}
