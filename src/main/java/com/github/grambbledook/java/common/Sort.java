package com.github.grambbledook.java.common;

import java.util.Arrays;

public interface Sort {
    default void sort(int[] nums, int offset) {
        Arrays.sort(nums, offset, nums.length);
    }
}
