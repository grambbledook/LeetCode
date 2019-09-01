package com.github.grambbledook.java.task997;


public class Solution {

    public int findJudge(int N, int[][] input) {
        if (input.length == 0) return 1;

        int judge = -1;

        int[] votesFor = new int[N + 1];
        for (int[] t : input) {
            int citizen = t[0];
            votesFor[citizen] = -1;

            int candidate = t[1];
            if (votesFor[candidate] != -1) {
                votesFor[candidate] = votesFor[candidate] + 1;
                if (votesFor[candidate] == N - 1) judge = candidate;
            }
        }

        if (judge == -1 || votesFor[judge] == -1) return -1;
        else return judge;
    }

}