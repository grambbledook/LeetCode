package com.github.grambbledook.java.task1089;

public class Solution {
    public void duplicateZeros(int[] arr) {
        int zeroes = 0;
        int size = arr.length -1;

        for (int i = 0; i < size; i++) {
            if (i + zeroes > size) break;

            if (arr[i] == 0) {
                if (i == size - zeroes) {
                    arr[size] = 0;
                    size--;
                    break;
                }
                zeroes++;
            }
        }

        for (int i = size - zeroes; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + zeroes] = 0;
                arr[i + zeroes - 1] = 0;

                zeroes--;
            } else {
                arr[i + zeroes] = arr[i];
            }
        }

    }

}
