package com.github.grambbledook.java.task236;

import com.github.grambbledook.java.common.TreeNode;

import java.util.LinkedList;

public class Solution {

    private LinkedList<TreeNode> pathToP;
    private LinkedList<TreeNode> pathToQ;
    private LinkedList<TreeNode> path = new LinkedList<>();

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) return null;

        search(root, p.val, q.val);

        TreeNode lca = null;
        while (!pathToP.isEmpty() && !pathToQ.isEmpty()) {
            TreeNode l = pathToP.poll();
            TreeNode r = pathToQ.poll();

            if (l == r) lca = l;
            else break;
        }
        return lca;
    }

    private void search(TreeNode node, int p, int q) {
        if (node == null) return;

        path.add(node);

        if (node.val == p) pathToP = new LinkedList<>(path);
        if (node.val == q) pathToQ = new LinkedList<>(path);

        search(node.left, p, q);
        search(node.right, p, q);

        path.removeLast();
    }
}
