package com.github.grambbledook.java.common;

public interface Reverse {

    default void reverse(int[] nums) {
        reverse(nums, 0);
    }

    default void reverse(int[] nums, int offset) {
        int last = nums.length - 1;

        for (int l = offset; l <= last; l++) {
            int r = last - l + offset;
            if (l > r) break;

            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
        }
    }

}
