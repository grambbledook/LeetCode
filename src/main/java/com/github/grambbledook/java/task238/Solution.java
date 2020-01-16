package com.github.grambbledook.java.task238;

public class Solution implements ArrayProduct {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        if (n == 0) return nums;

        int[] l = new int[n];
        int[] r = new int[n];
        int[] result = new int[n];

        l[0] = nums[0];
        for (int i = 1; i < n; i++) {
            l[i] = l[i - 1] * nums[i];
        }

        r[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            r[i] = r[i + 1] * nums[i];
        }

        for (int i = 0; i < result.length; i++) {
            if (i == 0) result[i] = r[i + 1];
            else if (i == n - 1) result[i] = l[i - 1];
            else result[i] = l[i - 1] * r[i + 1];
        }

        return result;
    }

}
