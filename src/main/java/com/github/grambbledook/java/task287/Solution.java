package com.github.grambbledook.java.task287;

public class Solution {

    public int findDuplicate(int[] nums) {
        int tortiose = 0;
        int hare = 0;

        do {
            tortiose = nums[tortiose];
            hare = nums[nums[hare]];
        } while (tortiose != hare);


        int left = nums[0];
        int right = nums[hare];

        while (left != right) {
            left = nums[left];
            right = nums[right];
        }

        return left;
    }

}
