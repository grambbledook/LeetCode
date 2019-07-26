package com.github.grambbledook.java.task31;

import com.github.grambbledook.java.common.Reverse;
import com.github.grambbledook.java.common.Swap;

public class Solution implements Swap, Reverse {
    public void nextPermutation(int[] nums) {
        int idx = -1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (hasNextPermutation(nums, i)) {
                idx = i;
                nextPermutation(nums, idx);
                break;
            }
        }

        reverse(nums, idx + 1);
    }

    private boolean hasNextPermutation(int[] nums, int offset) {
        return nums[offset] < nums[offset + 1];
    }

    private void nextPermutation(int[] nums, int offset) {
        int nextGreater = findNextGreaterElement(nums, offset);
        swap(nums, offset, nextGreater);
    }

    private int findNextGreaterElement(int[] nums, int offset) {
        for (int i = offset + 1; i <= nums.length - 1; i++) {
            if (nums[i] <= nums[offset]) {
                return i - 1;
            }
        }
        return nums.length - 1;
    }

}