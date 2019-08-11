package com.github.grambbledook.java.task167;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int current = nums[l] + nums[r];

            if (target == current) break;
            else if (target > current) l++;
            else r--;
        }

        return new int[]{l + 1, r + 1};
    }

}
