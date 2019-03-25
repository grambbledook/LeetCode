package com.github.grambbledook.java.task324;


import com.github.grambbledook.java.common.QuickselectIterative;
import com.github.grambbledook.java.common.ThreeWayPartition;

public class Solution implements QuickselectIterative, ThreeWayPartition {

    public void wiggleSort(int[] nums) {
        if (nums.length < 2) return;

        int median = select(nums, nums.length / 2);
        theWayPartition(nums, median);
        wiggle(nums);
    }

    private void wiggle(int[] nums) {
        int[] wiggled = wiggle(nums, nums.length / 2 - 1);

        System.arraycopy(wiggled, 0, nums, 0, wiggled.length);
    }

    private int[] wiggle(int[] nums, int median) {
        int[] array = new int[nums.length];

        int l = 1;
        int r = 0;

        for (int i = 0; i < median + 1; i++) {
            array[l] = nums[i];
            l += 2;
        }

        for (int i = 1; i < median + 2 + nums.length % 2; i++) {
            int idx = median + i;
            array[r] = nums[idx];
            r += 2;
        }
        return array;
    }
}
