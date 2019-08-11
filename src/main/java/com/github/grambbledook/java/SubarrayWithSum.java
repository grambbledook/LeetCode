package com.github.grambbledook.java;

public class SubarrayWithSum {

    public int[] find(int[] nums, int target) {
        int l = 0;
        int r = 0;

        int sum = 0;
        for (int num : nums) {

            sum += num;
            while (sum > target) {
                sum -= nums[l];
                l++;
            }

            if (sum == target) break;
            else if (sum < target) r++;
        }

        return new int[]{l, r};
    }
}
