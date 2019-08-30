package com.github.grambbledook.java.task297;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


/**
 * TODO rework this
 *
 * Runtime: 32 ms, faster than 19.12% of Java online submissions for Serialize and Deserialize Binary Tree.
 * Memory Usage: 42.4 MB, less than 15.24% of Java online submissions for Serialize and Deserialize Binary Tree.
 * */

public class Codec {
    private static final String VALUE_SEPARATOR = " ";
    private static final String FIELD_SEPARATOR = ",";
    private static final String START = "0";

    public String serialize(TreeNode root) {
        Stack<Object[]> stack = new Stack<Object[]>() {{add(new Object[]{0, root});}};

        int idx = 1;
        StringBuilder builder = new StringBuilder();

        while (!stack.isEmpty()) {
            Object[] wrapper = stack.pop();
            int id = (int) wrapper[0];
            TreeNode node = (TreeNode) wrapper[1];

            if (node == null) continue;
            else {

                int leftIdx = idx++;
                int rightIdx = idx++;
                builder.append(id)
                        .append(FIELD_SEPARATOR)
                        .append(node.val)
                        .append(FIELD_SEPARATOR)
                        .append(leftIdx)
                        .append(FIELD_SEPARATOR)
                        .append(rightIdx);

                stack.push(new Object[]{leftIdx, node.left});
                stack.push(new Object[]{rightIdx, node.right});
            }
            if (!stack.isEmpty()) builder.append(VALUE_SEPARATOR);
        }
        return builder.toString().trim();
    }

    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0) return null;

        Map<String, String[]> nodes = new HashMap<>();
        for (String s : data.split(VALUE_SEPARATOR)) {
            String[] strings = s.split(FIELD_SEPARATOR);
            nodes.putIfAbsent(strings[0], strings);
        }

        return deserialize(START, nodes);
    }

    private TreeNode deserialize(String id, Map<String, String[]> nodes) {
        String[] data = nodes.get(id);
        if (data == null) return null;

        TreeNode node = new TreeNode(Integer.parseInt(data[1]));
        node.left = deserialize(data[2], nodes);
        node.right = deserialize(data[3], nodes);

        return node;
    }
}
