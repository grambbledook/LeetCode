package com.github.grambbledook.java.task173;

import com.github.grambbledook.java.common.TreeNode;

import java.util.Stack;

public class BSTIterator {

    private Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        visitLeftSubtree(root);
    }

    private void visitLeftSubtree(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    public int next() {
        TreeNode node = stack.pop();
        if (node.right != null) visitLeftSubtree(node.right);

        return node.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

}