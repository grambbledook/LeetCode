package com.github.grambbledook.java.task11;


public class Solution implements MaxArea {

    public int maxArea(int[] nums) {
        int max = Integer.MIN_VALUE;

        int l = 0;
        int r = nums.length -1;

        while (l < r) {
            int length = r - l;
            int height = Math.min(nums[l], nums[r]);

            max = Math.max(max, height * length);

            if (nums[l] > nums[r]) r--;
            else l++;
        }

        return max;
    }

}