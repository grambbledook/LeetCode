package com.github.grambbledook.java.epi.kth_smallest_two;

public class KthSmallestInTwoArrays {

    public int kthSmallest(int[] array1, int[] array2, int k) {

        int kth = Integer.MAX_VALUE;

        int l = array1.length - 1;
        int r = array2.length - 1;

        while (l >= 0 && r >= 0) {
            int left = array1[l];
            int right = array2[r];

            int max = left > right ? left : right;

            if (max == left) l--;
            else r--;

            if (kth != max) {
                kth = max;
                k--;
            }

            if (k == 0) return kth;
        }

        while (l >= 0) {
            int max = array1[l--];

            if (kth != max) {
                kth = max;
                k--;
            }

            if (k == 0) return kth;
        }

        while (r >= 0) {
            int max = array2[r--];

            if (kth != max) {
                kth = max;
                k--;
            }

            if (k == 0) return kth;
        }

        return -1;
    }

}
