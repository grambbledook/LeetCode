package com.github.grambbledook.java.task124;

import com.github.grambbledook.java.common.TreeNode;

public class Solution {

    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);

        return max;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;

        int left = dfs(node.left);
        int right = dfs(node.right);

        int sum = node.val;

        if (left > 0) sum += left;
        if (right > 0) sum += right;

        max = Math.max(max, sum);

        return node.val + Math.max(Math.max(left, right), 0);
    }

}
