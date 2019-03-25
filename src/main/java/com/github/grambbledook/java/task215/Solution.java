package com.github.grambbledook.java.task215;


import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

public class Solution {

    public int findKthLargest(int[] nums, int k) {
        return quicksort(nums, k);
    }

    private int sdk(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    private int quicksort(int[] nums, int k) {
        quicksort0(nums, 0, nums.length - 1, k);
        return nums[k - 1];
    }

    private void quicksort0(int[] nums, int lo, int hi, int k) {
        if (lo < hi) {
            int p = partition(nums, lo, hi);
            if (k <= p) quicksort0(nums, lo, p - 1, k);
            else quicksort0(nums, p + 1, hi, k);
        }

    }

    private int partition(int[] nums, int lo, int hi) {

        int p = nums[hi];
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if (nums[j] >= p) {
                swap(nums, i, j);
                i++;
            }

        }
        swap(nums, i, hi);
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        Assertions.assertEquals(5, new Solution().quicksort(new int[]{3, 2, 1, 5, 6, 4}, 2));
        Assertions.assertEquals(4, new Solution().quicksort(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
        Assertions.assertEquals(-1, new Solution().quicksort(new int[]{-1, -1}, 2));
    }


}
