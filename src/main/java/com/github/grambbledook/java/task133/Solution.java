package com.github.grambbledook.java.task133;

import com.github.grambbledook.java.common.Node;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public Node cloneGraph(Node node) {
        return cloneGraph(node, new IdentityHashMap<>());
    }

    private Node cloneGraph(Node node, Map<Node, Node> state) {
        Node clone = state.get(node);

        if (clone == null) {
            clone = new Node();

            state.put(node, clone);

            clone.val = node.val;
            clone.neighbors = cloneNeighbors(node.neighbors, state);;
        }

        return clone;
    }

    private List<Node> cloneNeighbors(List<Node> neighbors, Map<Node, Node> state) {
        List<Node> clones = new ArrayList<>(neighbors.size());
        for (Node s : neighbors) {
            clones.add(cloneGraph(s, state));
        }
        return clones;
    }
}
