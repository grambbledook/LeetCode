package com.github.grambbledook.java.task283;

public class Solution {

    public void moveZeroes(int[] nums) {
        int l = 0;
        int r = 0;

        while (r < nums.length) {
            if (nums[r] != 0) {
                nums[l++] = nums[r];
            }

            r++;
        }

        while (l < nums.length) {
            nums[l++] = 0;
        }
    }

}
