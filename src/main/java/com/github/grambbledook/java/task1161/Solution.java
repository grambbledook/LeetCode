package com.github.grambbledook.java.task1161;

import com.github.grambbledook.java.common.TreeNode;


public class Solution {

    private int[] levels;

    public int maxLevelSum(TreeNode root) {
        init(root);
        dfs(root, 0);
        return findLevel();
    }

    private void init(TreeNode node) {
        int depth = depth(node);
        levels = new int[depth];
    }

    private int depth(TreeNode node) {
        if (node == null) return 0;

        int left = depth(node.left);
        int right = depth(node.right);
        return Math.max(left, right) + 1;
    }

    private void dfs(TreeNode node, int level) {
        if (node == null) return;

        levels[level] += node.val;

        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }

    private int findLevel() {
        int level = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < levels.length; i++) {
            int value = levels[i];
            if (max < value) {
                max = value;
                level = i;
            }
        }

        return level + 1;
    }
}