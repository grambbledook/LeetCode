package com.siskey.leetcode.java.task645;

public class Solution {

    public int[] findErrorNums(int[] nums) {
        int[] counters = new int[nums.length + 1];

        for (int num : nums) {
            counters[num] +=  1;
        }

        int dup = 0;
        int missing = 0;
        for (int i = 1; i <counters.length; i++ )  {
            if (counters[i] == 2) dup = i;
            else if (counters[i] == 0) missing = i;
        }

        return new int[] { dup, missing };
    }

}
