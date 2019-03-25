package com.github.grambbledook.java.common;

public interface ThreeWayPartition extends Swap {

    default void theWayPartition(int[] nums, int median) {
        int l = 0;
        int r = nums.length - 1;

        for (int i = 0; i < r; i++) {
            if (nums[i] > median) {
                swap(nums, i, l);
                l++;
            }
            if (nums[i] < median) {
                swap(nums, i, r);
                r--;
            }
        }

    }
}
