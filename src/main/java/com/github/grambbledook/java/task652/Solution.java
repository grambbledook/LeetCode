package com.github.grambbledook.java.task652;

import com.github.grambbledook.java.common.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution {

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        if (root == null || (root.right == null && root.left == null)) return Collections.emptyList();
        else return inspectSubtrees(root);
    }

    private List<TreeNode> inspectSubtrees(TreeNode root) {
        List<TreeNode> duplicates = new ArrayList<>();
        HashMap<String, Integer> index = new HashMap<>();

        findDuplicates(root, index, duplicates);
        return duplicates;
    }

    private String findDuplicates(TreeNode node, HashMap<String, Integer> index, List<TreeNode> duplicates) {
        if (node == null) return "X";

        String hash = node.val + findDuplicates(node.left, index, duplicates) + findDuplicates(node.right, index, duplicates);

        //Runtime: 8 ms, faster than 96.72% of Java online submissions for Find Duplicate Subtrees. if substitute this line with map.put and comparison
        Integer count = index.compute(hash, (k, v) -> v == null ? 0 : ++v);
        if (count == 1) duplicates.add(node);

        return hash;
    }
}
