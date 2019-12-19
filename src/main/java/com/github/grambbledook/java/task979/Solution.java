package com.github.grambbledook.java.task979;

import com.github.grambbledook.java.common.TreeNode;

public class Solution {
    public int distributeCoins(TreeNode root) {
        return dfs(root)[1];
    }

    private int[] dfs(TreeNode node) {
        if (node == null) return new int[]{0, 0};
        int[] l = dfs(node.left);
        int[] r = dfs(node.right);

        int moves = node.val + l[0] + r[0] - 1;
        int total = l[1] + r[1] + Math.abs(l[0]) + Math.abs(r[0]);

        return new int[]{moves, total};
    }
}