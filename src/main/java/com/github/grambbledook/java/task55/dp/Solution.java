package com.github.grambbledook.java.task55.dp;

import com.github.grambbledook.java.task55.JumpGame;

public class Solution implements JumpGame {
    public boolean canJump(int[] nums) {
        int[] cache = new int[nums.length];
        cache[cache.length - 1] = 1;

        return canJump(nums, cache);
    }

    private boolean canJump(int[] nums, int[] cache) {
        for (int i = nums.length - 2; i >= 0; i--) {
            int target = Math.min(i + nums[i], nums.length - 1);

            for (int j = i + 1; j <= target; j++) {
                if (cache[j] == 1) {
                    cache[i] = 1;
                    break;
                }
            }
        }

        return cache[0] == 1;
    }

}
