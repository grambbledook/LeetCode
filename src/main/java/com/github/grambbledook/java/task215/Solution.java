package com.github.grambbledook.java.task215;


import com.github.grambbledook.java.common.QuickselectIterative;

public class Solution implements QuickselectIterative {

    public int findKthLargest(int[] nums, int k) {
        return select(nums, k);
    }
}
