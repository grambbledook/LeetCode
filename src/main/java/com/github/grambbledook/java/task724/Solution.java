package com.github.grambbledook.java.task724;

public class Solution {
    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) return -1;

        int sum = 0;
        for (int i = 0; i < nums.length; i++) sum += nums[i];

        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            int r = sum - nums[i] - l;
            if (r == l) return i;

            l += nums[i];
        }

        return -1;
    }
}
