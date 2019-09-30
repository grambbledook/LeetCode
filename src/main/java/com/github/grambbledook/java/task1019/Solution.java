package com.github.grambbledook.java.task1019;

import com.github.grambbledook.java.common.ListNode;

public class Solution {

    public int[] nextLargerNodes(ListNode head) {
        if (head == null) return new int[0];

        int[] nums = asArray(head, 0);
        int[] result = new int[nums.length];

        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    result[j] = nums[i];
                } else {
                    break;
                }
            }
        }

        return result;
    }

    private int[] asArray(ListNode node, int offset) {
        if (node == null) return new int[offset];

        int[] result = asArray(node.next, offset + 1);

        result[offset] = node.val;
        return result;
    }
}