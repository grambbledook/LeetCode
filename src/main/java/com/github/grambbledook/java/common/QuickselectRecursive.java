package com.github.grambbledook.java.common;

public interface QuickselectRecursive extends Quickselect {

    public default int select(int[] nums, int k) {
        select(nums, k, 0, nums.length - 1);
        return nums[k - 1];
    }

    private void select(int[] nums, int k, int l, int r) {
        if (l >= r) return;

        int pivot = partition(nums, l, r);

        if (k <= pivot) select(nums, k, l, pivot - 1);
        else select(nums, k, pivot + 1, r);
    }

    private int partition(int[] nums, int l, int r) {
        int idx = calculatePivotIndex(l, r);
        int pivot = nums[idx];
        int i = l;
        for (int j = l; j < r; j++) {
            if (nums[j] >= pivot) {
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
