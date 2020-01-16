package com.github.grambbledook.java.task238.constant;

import com.github.grambbledook.java.task238.ArrayProduct;

public class Solution implements ArrayProduct {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        if (n == 0) return nums;

        int[] result = new int[n];

        result[0] = nums[0];
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * (i == n - 1 ? 1 : nums[i]);
        }

        int right = 1;
        for (int i = n - 2; i >= 0; i--) {
            right *= nums[i + 1];
            result[i] = right * (i == 0 ? 1 : result[i - 1]);
        }

        return result;
    }

}
