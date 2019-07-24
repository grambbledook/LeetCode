package com.github.grambbledook.java.common;

public interface BinarySearch {

    enum Trailing {
        LEFT, RIGHT, DISABLED
    }

    default int search(int[] nums, int target) {
        return search(nums, target, Trailing.DISABLED);
    }

    default int searchLeft(int[] nums, int target) {
        return search(nums, target, Trailing.LEFT);
    }

    default int searchRight(int[] nums, int target) {
        return search(nums, target, Trailing.RIGHT);
    }

    default int search(int[] nums, int target, Trailing left) {
        int l = 0;
        int r = nums.length - 1;
        int mid = (l + r) / 2;

        int index = -1;
        while (l <= r) {
            if (nums[mid] == target) {
                index = mid;
                if (left == Trailing.DISABLED) break;
                else if (left == Trailing.LEFT) r = mid - 1;
                else l = mid + 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }

            mid = (l + r) / 2;
        }

        return index;
    }

}
