package com.github.grambbledook.java.task103;

import com.github.grambbledook.java.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    LinkedList<TreeNode> q = new LinkedList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode node = q.pop();
            System.out.println(node.val);
            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }

        return new ArrayList<>();
    }

}
