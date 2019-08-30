package com.github.grambbledook.java.task297;


public class Codec {
    private static final String NULL = "null";
    private static final String SEPARATOR = " ";

    public String serialize(TreeNode root) {
        StringBuilder builder = new StringBuilder();
        serialize(root, builder);
        return builder.toString();
    }

    private void serialize(TreeNode node, StringBuilder builder) {
        if (node == null) {
            builder.append(NULL).append(SEPARATOR);
        } else {
            builder.append(node.val).append(SEPARATOR);
            serialize(node.left, builder);
            serialize(node.right, builder);
        }
    }

    public TreeNode deserialize(String data) {
        String[] values = data.split(SEPARATOR);
        return deserialize(values, new Offset());
    }

    private TreeNode deserialize(String[] values, Offset offset) {
        if (offset.current >= values.length) return null;
        String value = values[offset.current];

        if (value.equals(NULL)) return null;
        else {
            Integer n = Integer.valueOf(value);
            TreeNode node = new TreeNode(n);

            node.left = deserialize(values, offset.next());

            node.right = deserialize(values, offset.next());
            return node;
        }
    }

    private static class Offset {
        int current = 0;

        Offset next() {
            current++;
            return this;
        }
    }

}
