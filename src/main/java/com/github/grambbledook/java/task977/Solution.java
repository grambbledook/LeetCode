package com.github.grambbledook.java.task977;

public class Solution {

    public int[] sortedSquares(int[] A) {
        if (A == null) return null;

        int[] result = new int[A.length];

        int l = 0;
        int r = A.length - 1;

        for (int i = result.length - 1; i >= 0; i--) {
            int left = A[l];
            int right = A[r];

            if (Math.abs(left) > right) {
                result[i] = left * left;
                l++;
            } else {
                result[i] = right * right;
                r--;
            }
        }

        return result;
    }

}