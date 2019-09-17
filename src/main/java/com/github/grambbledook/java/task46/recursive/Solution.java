package com.github.grambbledook.java.task46.recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution implements Permutations {

    private List<List<Integer>> results = new ArrayList<>();

    private boolean[] visited;
    private Integer[] permutation;

    public List<List<Integer>> permute(int[] nums) {
        visited = new boolean[nums.length];
        permutation = new Integer[nums.length];

        permuteInternal(nums, 0);
        return results;
    }

    private void permuteInternal(int[] nums, int iteration) {
        if (iteration == nums.length) {
            results.add(Arrays.asList(permutation.clone()));
            return;
        }

        for (int i= 0; i < nums.length; i++) {
            if (visited[i]) continue;

            visited[i] = true;
            permutation[iteration] = nums[i];

            permuteInternal(nums, iteration + 1);

            permutation[iteration] = null;
            visited[i] = false;
        }

    }

}