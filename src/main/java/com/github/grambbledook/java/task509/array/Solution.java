package com.github.grambbledook.java.task509.array;

public class Solution {

    public int fib(int N) {
        if (N == 0) return 0;

        int[] fibs = new int[N + 1];
        fibs[1] = 1;

        for (int i = 2; i <= N; i++) {
            fibs[i] = fibs[i-1] + fibs[i-2];
        }

        return fibs[N];
    }

}
