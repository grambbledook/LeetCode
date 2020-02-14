package com.github.grambbledook.leetcode.task199

import com.github.grambbledook.java.common.TreeNode
import java.util.*
import kotlin.math.max

class Solution {

    private val rightmostNodes = mutableMapOf<Int, Int>()

    fun rightSideView(root: TreeNode?): List<Int> {
        root ?: return emptyList()

        val q = LinkedList<Pair<TreeNode, Int>>().apply {
            add(root to 0)
        }

        var maxDepth = Int.MIN_VALUE
        while (q.isNotEmpty()) {
            val (node, depth) = q.pop()

            node.left?.also {
                q.add(it to depth + 1)
            }

            node.right?.also {
                q.add(it to depth + 1)
            }

            maxDepth = max(depth, maxDepth)
            rightmostNodes[depth] = node.`val`
        }

        return (0..maxDepth).map {
            rightmostNodes[it]!!
        }
    }

}
