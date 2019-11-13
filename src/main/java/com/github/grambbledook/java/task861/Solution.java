package com.github.grambbledook.java.task861;


import java.util.Arrays;

public class Solution {

    private int n;
    private int m;

    public int matrixScore(int[][] A) {
        n = A.length;
        m = A[0].length;

        return Arrays.stream(flip(A))
                .mapToInt(this::toNumber)
                .sum();
    }

    private int[][] flip(int[][] A) {
        boolean flipped;

        do {
            flipped = flipColumns(A) || flipRows(A);
        } while (flipped);

        return A;
    }

    private boolean flipColumns(int[][] nums) {
        boolean result = false;

        for (int column = 0; column < m; column++) {
            if (countZeroes(nums, column) > n / 2) {
                result = flipColumn(nums, column);
            }
        }

        return result;
    }

    private int countZeroes(int[][] nums, int column) {
        int zeroes = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i][column] == 0) zeroes++;
        }
        return zeroes;
    }

    private boolean flipColumn(int[][] nums, int column) {
        for (int i = 0; i < n; i++) {
            nums[i][column] ^= 1;
        }

        return true;
    }

    private boolean flipRows(int[][] nums) {
        boolean result = false;

        for (int[] num : nums) {
            if (num[0] == 0) result = flipRow(num);
        }

        return result;
    }

    private boolean flipRow(int[] num) {
        for (int j = 0; j < m; j++) {
            num[j] ^= 1;
        }

        return true;
    }

    private int toNumber(int[] num) {
        int sum = 0;
        for (int i = m - 1; i >= 0; i--) {
            if (num[i] == 1) sum += Math.pow(2, m - 1 - i);
        }
        return sum;
    }

}
