package com.github.grambbledook.java.task236;

import com.github.grambbledook.java.common.TreeNode;


public class Solution {

    private TreeNode lca;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) return null;

        search(root, p.val, q.val);

        return lca;
    }

    private boolean search(TreeNode node, int p, int q) {
        if (node == null) return false;

        int left = search(node.left, p, q) ? 1 : 0;
        int right = search(node.right, p, q) ? 1 : 0;
        int mid = (node.val == p || node.val == q) ? 1 : 0;

        if (left + mid + right >= 2) lca = node;
        return (left + mid + right > 0);
    }
}
