package com.github.grambbledook.java.common;

public interface QuickselectIterative extends Quickselect {

    default int select(int[] nums, int k) {
        select(nums, k, 0, nums.length - 1);
        return nums[k - 1];
    }

    private void select(int[] nums, int k, int l, int r) {
        while (l < r) {
            int pivot = partition(nums, l, r);

            if (k <= pivot) r = pivot - 1;
            else l = pivot + 1;
        }
    }

    private int partition(int[] nums, int l, int r) {
        int idx = calculatePivotIndex(l, r);
        int p = nums[idx];
        int i = l;
        for (int j = l; j < r; j++) {
            if (nums[j] >= p) {
                swap(nums, i, j);
                i++;
            }
        }
        swap(nums, i, r);
        return i;
    }

    private int calculatePivotIndex(int l, int r) {
        return r;
    }
}
