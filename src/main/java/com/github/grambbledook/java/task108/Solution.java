package com.github.grambbledook.java.task108;

import com.github.grambbledook.java.common.TreeNode;

public class Solution {

    private int[] nums;

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;

        this.nums = nums;
        return buildBst(0, nums.length - 1);
    }

    private TreeNode buildBst(int l, int r) {
        if (l > r) return null;

        int mid = (l + r) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildBst(l, mid - 1);
        node.right = buildBst(mid + 1, r);

        return node;
    }
}
