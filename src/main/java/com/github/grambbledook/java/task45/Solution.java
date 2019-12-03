package com.github.grambbledook.java.task45;

public class Solution implements JumpGame2 {

    public int jump(int[] nums) {
        return jump(nums, 0) - 1;
    }

    private int jump(int[] nums, int i) {
        if (i >= nums.length - 1) {
            return 1;
        }

        if (nums[i] == 0) {
            return -1;
        }

        int maxLength = nums[i];
        int result = Integer.MAX_VALUE;

        for (int j = 1; j <= maxLength; j++) {
            int next = jump(nums, i + j);

            if (next != -1) result = Math.min(result, next);
        }

        return result == Integer.MAX_VALUE ? -1 : result + 1;
    }

}
