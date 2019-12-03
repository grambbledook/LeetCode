package com.github.grambbledook.java.task15;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) return Collections.emptyList();

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int a = nums[i];

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int b = nums[l];
                int c = nums[r];
                int sum = a + b + c;

                if (sum < 0) l++;
                else if (sum > 0) r--;
                else {
                    result.add(Arrays.asList(a, b, c));
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                }
            }

        }

        return result;
    }

}
