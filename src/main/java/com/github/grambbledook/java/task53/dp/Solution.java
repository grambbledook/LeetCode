package com.github.grambbledook.java.task53.dp;

import com.github.grambbledook.java.task53.MaxSubarray;

public class Solution implements MaxSubarray {

    public int maxSubArray(int[] nums) {
        int[] cache = new int[nums.length + 1];
        cache[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            cache[i] = Math.max(cache[i - 1] + nums[i], nums[i]);
        }

        return max(cache, nums.length);
    }

    private int max(int[] nums, int last) {
        int max = Integer.MIN_VALUE;

        for (int i= 0; i < last; i ++) {
            max = Math.max(max, nums[i]);
        }

        return max;
    }


}