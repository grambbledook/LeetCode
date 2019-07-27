package com.github.grambbledook.java.task11;


public class Solution implements MaxArea {

    public int maxArea(int[] nums) {
        int max = Integer.MIN_VALUE;

        int l = 0;
        int r = nums.length - 1;
        while (l < r) {

            int ox = r - l;
            int oy = Math.min(nums[l], nums[r]);

            int current = ox * oy;
            if (max < current) max = current;

            if (nums[l] < nums[r]) l++;
            else r--;
        }

        return max;
    }

}