package com.github.grambbledook.java.task189;

public class Solution {

    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0 || k == nums.length) return;

        int offset = Math.abs(nums.length - k % nums.length);

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
