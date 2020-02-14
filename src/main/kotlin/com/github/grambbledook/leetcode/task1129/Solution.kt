package com.github.grambbledook.leetcode.task1129

import java.util.*

class Solution {

    fun shortestAlternatingPaths(n: Int, red_edges: Array<IntArray>, blue_edges: Array<IntArray>): IntArray {
        val result = IntArray(n) { Int.MAX_VALUE }

        val edges = mutableMapOf<Int, MutableList<Pair<Int, Int>>>().apply {
            add(red_edges, 1)
            add(blue_edges, -1)
        }

        val visited = mutableSetOf<Pair<Int, Int>>()

        val q = LinkedList<Pair<Int, Int>>()
        q.add(Pair(0, 0))

        var lvl = 0
        while (q.isNotEmpty()) {
            lvl++
            var size = q.size
            while (size-- > 0) {
                val a = q.pop()
                for (edge in edges[a.first]!!) {
                    if (!visited.contains(edge) && edge.first != a.second)
                        if (result[edge.first] != -1) result[edge.first] = lvl
                    visited.add(edge)
                    q.push(Pair(edge.first, edge.second))
                }
            }

        }
        return result
    }

    private fun MutableMap<Int, MutableList<Pair<Int, Int>>>.add(edges: Array<IntArray>, type: Int) {
        for (edge in edges) {
            val e = this[edge[0]] ?: mutableListOf()
            e.add(edge[1] to type)
            this[edge[0]] = e
        }
    }

}