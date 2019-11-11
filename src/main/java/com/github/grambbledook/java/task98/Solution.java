package com.github.grambbledook.java.task98;

import com.github.grambbledook.java.common.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution implements ValidateBst {

    private Deque<Frame> stack = new LinkedList<>();

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        stack.push(frame(root, Long.MIN_VALUE, Long.MAX_VALUE));

        while (!stack.isEmpty()) {
            Frame frame = stack.pop();
            TreeNode node = frame.node;

            if (node.val <= frame.low) return false;
            if (node.val >= frame.high) return false;

            if (node.left != null) stack.push(frame(node.left, frame.low, node.val));
            if (node.right != null) stack.push(frame(node.right, node.val, frame.high));
        }

        return true;
    }

    private static Frame frame(TreeNode node, long low, long high) {
        return new Frame(node, low, high);
    }

    private static class Frame {

        final TreeNode node;
        final long low;
        final long high;

        private Frame(TreeNode node, long low, long high) {
            this.node = node;
            this.low = low;
            this.high = high;
        }

    }

}
