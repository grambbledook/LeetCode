package com.github.grambbledook.java.task189;

public class Solution {

    public void rotate(int[] nums, int k) {
        if (nums.length == 1 || nums.length == k) return;
        if (k > nums.length) k = k - nums.length;

        int offset = nums.length - k;

        reverse(nums, 0, offset - 1);
        reverse(nums, offset, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;

            l++; r--;
        }
    }

}
