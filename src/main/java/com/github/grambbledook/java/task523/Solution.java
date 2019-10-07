package com.github.grambbledook.java.task523;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private Map<Integer, Integer> map = new HashMap<>();
    {
        map.put(0, -1);
    }

    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums == null || nums.length < 2) return false;
        k = Math.abs(k);

        if (k == 1) return true;
        if (k == 0) return containsZeroes(nums);

        int sum = 0;
        for (int r = 0; r < nums.length; r++) {
            sum = (sum + nums[r]) % k;

            Integer l = map.get(sum);
            if (l == null) map.put(sum, r);
            else if (r - l > 1) return true;
        }

        return false;
    }

    private boolean containsZeroes(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) return true;
        }

        return false;
    }

}
