package com.github.grambbledook.java.task34;

import com.github.grambbledook.java.common.BinarySearch;

public class Solution implements BinarySearch {
    public int[] searchRange(int[] nums, int target) {

        int left = searchLeft(nums, target);
        int right = searchRight(nums, target);

        return new int[]{left, right};
    }

}
