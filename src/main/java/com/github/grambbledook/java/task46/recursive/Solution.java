package com.github.grambbledook.java.task46.recursive;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Solution implements Permutations {

    @Override
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedHashSet<Integer> state = new LinkedHashSet<>();
        permuteInternal(nums, state, result);
        return result;
    }

    private void permuteInternal(int[] nums, LinkedHashSet<Integer> state, List<List<Integer>> results) {
        if (state.size() == nums.length) {
            List<Integer> result = new ArrayList<>(state);
            results.add(result);
            return;
        }

        for (int num : nums) {
            if (!state.contains(num)) {
                state.add(num);
                permuteInternal(nums, state, results);
                state.remove(num);
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new Solution().permute(new int[]{1, 2, 3});
        System.out.println(list);
    }

}