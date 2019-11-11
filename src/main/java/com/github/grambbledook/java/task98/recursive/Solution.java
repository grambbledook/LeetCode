package com.github.grambbledook.java.task98.recursive;

import com.github.grambbledook.java.common.TreeNode;
import com.github.grambbledook.java.task98.ValidateBst;

public class Solution implements ValidateBst {

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        return isValid(root, null, null);
    }

    private boolean isValid(TreeNode node, Integer lowerBound, Integer upperBound) {
        if (node == null) return true;

        if (lowerBound != null && node.val <= lowerBound) return false;
        if (upperBound != null && node.val  >= upperBound) return false;

        return  isValid(node.left, lowerBound, node.val) && isValid(node.right, node.val, upperBound);
    }

}
