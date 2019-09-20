package com.github.grambbledook.java.task77;

import java.util.List;
import java.util.ArrayList;

public class Solution {

    private int[] combination;
    private List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        if (k > n) return results;
        combination = new int[k];

        combineRecursively(1, n, k);
        return results;
    }

    private void combineRecursively(int start, int n, int remaining) {
        if (remaining == 0) {
            finalizeCombination();
            return;
        }

        if (start > n) return;
        for (int next = start; next <= n; next++) {
            combination[combination.length - remaining] = next;
            combineRecursively(next + 1, n, remaining - 1);
        }
    }

    private void finalizeCombination() {
        List<Integer> l = new ArrayList<>(combination.length);

        for (int i = 0; i < combination.length; i++) {
            l.add(combination[i]);
        }

        results.add(l);
    }

}
