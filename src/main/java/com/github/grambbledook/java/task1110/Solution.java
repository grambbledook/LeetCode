package com.github.grambbledook.java.task1110;

import com.github.grambbledook.java.common.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Solution {

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> nodes = new HashSet<>();
        for (int num : to_delete) {
            nodes.add(num);
        }

        List<TreeNode> result = new ArrayList<>();

        boolean add = dfs(root, nodes, result);
        if (add) result.add(root);
        else {
            root.right = null;
            root.left = null;
        }
        return result;
    }

    private boolean dfs(TreeNode node, Set<Integer> toDelete, List<TreeNode> result) {
        boolean addRight = false;
        if (node.right != null) {
            addRight = dfs(node.right, toDelete, result);
        }

        boolean addLeft = false;
        if (node.left != null) {
            addLeft = dfs(node.left, toDelete, result);

        }

        boolean delete = toDelete.contains(node.val);
        if (!delete) {
            if (!addLeft) node.left = null;
            if (!addRight) node.right = null;
            return true;
        }

        if (addLeft) {
            result.add(node.left);
            node.left = null;
        }
        if (addRight) {
            result.add(node.right);
            node.right = null;
        }

        return false;
    }
}