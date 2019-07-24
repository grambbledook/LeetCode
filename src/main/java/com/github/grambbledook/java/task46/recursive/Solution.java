package com.github.grambbledook.java.task46.recursive;

import com.github.grambbledook.java.common.Swap;
import com.github.grambbledook.java.common.ToList;

import java.util.ArrayList;
import java.util.List;

public class Solution implements Swap, ToList {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permuteInternal(nums.length, nums, result);
        return result;
    }

    private void permuteInternal(int n, int[] nums, List<List<Integer>> result) {
        if (n == 1) result.add(toList(nums));
        else {
            for (int i = 0; i < n - 1; i++) {
                permuteInternal(n - 1, nums, result);
                if (n % 2 == 0) swap(nums, i, n - 1);
                else swap(nums, 0, n - 1);
            }
            permuteInternal(n - 1, nums, result);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new Solution().permute(new int[]{1, 2, 3});
        System.out.println(list);
    }

}