package com.github.grambbledook.java.task509;

public class Solution {

    public int fib(int N) {
        if (N == 0) return 0;

        int first = 0;
        int result = 1;

        for (int i = 1; i < N; i++) {
            int last = first;
            first = result;

            result = first + last;
        }

        return result;
    }

}
