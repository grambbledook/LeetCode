package com.github.grambbledook.java.common;

import java.util.concurrent.atomic.AtomicInteger;

public interface Swap {
    AtomicInteger counter = new AtomicInteger();

    default void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
