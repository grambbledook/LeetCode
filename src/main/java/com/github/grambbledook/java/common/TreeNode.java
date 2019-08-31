package com.github.grambbledook.java.common;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }


    @Override
    public String toString() {
        String node = "(" + val +" [{left}, {right}])";
        String left = this.left == null ? "null" : this.left.toString();
        String right = this.right == null ? "null" : this.right.toString();

        return node.replaceAll("\\{left}", left).replaceAll("\\{right}", right);
    }
}
