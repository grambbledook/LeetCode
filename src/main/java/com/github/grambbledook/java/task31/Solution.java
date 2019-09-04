package com.github.grambbledook.java.task31;

public class Solution {

    public void nextPermutation(int[] nums) {
        int offset = -1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (hasNextPermutation(nums, i)) {
                nextPermutation(nums, i);
                offset = i;
                break;
            }
        }

        reverse(nums, offset);
    }

    private boolean hasNextPermutation(int[] nums, int i) {
        return nums[i] < nums[i + 1];
    }

    private void nextPermutation(int[] nums, int offset) {
        int next = offset;

        for (int i = offset + 1; i < nums.length; i++) {
            if (nums[i] > nums[offset]) next = i;
            else break;
        }

        swap(nums, offset, next);
    }

    private void reverse(int[] nums, int offset) {
        int l = offset + 1;
        int r = nums.length - 1;

        while (l < r) swap(nums, l++, r--);
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}