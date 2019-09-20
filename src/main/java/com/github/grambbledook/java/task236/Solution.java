package com.github.grambbledook.java.task236;

import com.github.grambbledook.java.common.TreeNode;

import java.util.LinkedList;

public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) return null;

        LinkedList<TreeNode> pathToP = search(root, p);
        LinkedList<TreeNode> pathToQ = search(root, q);

        TreeNode lca = null;
        while (!pathToP.isEmpty() && !pathToQ.isEmpty()) {
            TreeNode l = pathToP.poll();
            TreeNode r = pathToQ.poll();

            if (l == r) lca = l;
            else break;
        }
        return lca;
    }

    private LinkedList<TreeNode> search(TreeNode root, TreeNode p) {
        LinkedList<TreeNode> path = new LinkedList<>();
        searchRecursively(root, p, path);
        return path;
    }

    private boolean searchRecursively(TreeNode node, TreeNode p, LinkedList<TreeNode> path) {
        if (node == null) return false;

        path.add(node);

        if (node.val == p.val) return true;
        else if (searchRecursively(node.left, p, path)) return true;
        else if (searchRecursively(node.right, p, path)) return true;

        path.removeLast();
        return false;
    }
}
