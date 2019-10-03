package com.github.grambbledook.java.task1161;

import com.github.grambbledook.java.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<Integer> levels = new ArrayList<>();

    public int maxLevelSum(TreeNode root) {

        dfs(root, 0);

        return findLevel();
    }

    private void dfs(TreeNode node, int level) {
        if (node == null) return;

        if (level + 1 > levels.size()) levels.add(0);
        int sum = node.val + levels.get(level);

        levels.set(level, sum);
        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }

    private int findLevel() {
        int level = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < levels.size(); i++) {
            int value = levels.get(i);
            if (max < value) {
                max = value;
                level = i;
            }
        }

        return level + 1;
    }
}