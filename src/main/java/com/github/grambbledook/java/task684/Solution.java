package com.github.grambbledook.java.task684;

import java.util.HashSet;
import java.util.Set;

public class Solution {


    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;


        Set<Integer> state = new HashSet<>();

        int[] latest = new int[0];
        for (int[] edge: edges) {
            boolean unique = state.add(edge[1]);
            if (!unique) latest = edge;
        }

        return latest;
    }

}
