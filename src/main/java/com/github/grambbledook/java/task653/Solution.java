package com.github.grambbledook.java.task653;

import com.github.grambbledook.java.common.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean findTarget(TreeNode root, int target) {
        Set<Integer> state = new HashSet<>();
        return go(root, target, state);
    }

    private boolean go(TreeNode root, int target, Set<Integer> state) {
        if (root == null) return false;
        if (state.contains(root.val)) return true;

        state.add(target - root.val);
        return go(root.left, target, state) || go(root.right, target, state);
    }

}
