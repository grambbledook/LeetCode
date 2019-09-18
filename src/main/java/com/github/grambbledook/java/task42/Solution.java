package com.github.grambbledook.java.task42;


public class Solution {

    public int trap(int[] nums) {
        if (nums == null || nums.length < 3) return 0;

        int[] left = new int[nums.length];
        left[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            left[i] = Math.max(left[i - 1], nums[i]);
        }

        int[] right = new int[nums.length];
        right[right.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], nums[i]);
        }

        int elevation = 0;

        for (int i = 0; i < nums.length; i++) {
            elevation += (Math.min(left[i], right[i])) - nums[i];
        }

        return elevation;
    }
}
