package com.github.grambbledook.java.common;

public interface Swap {

    default void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
