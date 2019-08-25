package com.github.grambbledook.java.task53.dc;

import com.github.grambbledook.java.task53.MaxSubarray;

public class Solution implements MaxSubarray {

    public int maxSubArray(int[] nums) {
        return divide(nums, 0, nums.length - 1);
    }

    private int divide(int[] nums, int l, int r) {
        if (l >= r) return nums[l];

        int mid = l + (r - l) / 2;
        int left = divide(nums, l, mid);
        int right = divide(nums, mid + 1, r);
        int middle = overlap(nums, l, r, mid);

        return Math.max(left, Math.max(middle, right));
    }

    private int overlap(int[] nums, int l, int r, int mid) {
        int max = nums[mid];

        int sum = nums[mid];
        for (int i = mid - 1; i >= l; i--) {
            sum += nums[i];
            max = Math.max(sum, max);
        }

        sum = max;
        for (int i = mid + 1; i <= r; i++) {
            sum += nums[i];
            max = Math.max(sum, max);
        }

        return max;
    }

}