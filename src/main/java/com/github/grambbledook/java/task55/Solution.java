package com.github.grambbledook.java.task55;

public class Solution implements JumpGame {
    public boolean canJump(int[] nums) {
        int position = nums.length - 1;

        for (int i = position; i >= 0; i--) {
            if (position <= i + nums[i]) position = i;
        }

        return position == 0;
    }
}
