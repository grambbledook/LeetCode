package com.github.grambbledook.java.task167;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;

        int[] result = {-1, -1};
        while (l < r) {
            int current = nums[l] + nums[r];

            if (target > current) l++;
            else if (target < current) r--;
            else {
                result[0] = l + 1;
                result[1] = r + 1;
                break;
            }
        }

        return result;
    }

}
