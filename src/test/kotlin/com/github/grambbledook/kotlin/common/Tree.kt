package com.github.grambbledook.kotlin.common

import com.github.grambbledook.java.common.TreeNode


fun tree(value: Int): TreeNode {
    return TreeNode(value)
}

fun TreeNode.left(f: () -> TreeNode): TreeNode {
    return this.apply { this.left = f() }
}

fun TreeNode.right(f: () -> TreeNode): TreeNode {
    return this.apply { right = f() }
}


fun TreeNode.equals(other: Any?): Boolean {
    fun foo(a: TreeNode?, b: TreeNode?) = a?.equals(b) ?: (b == null)

    return when (other) {
        is TreeNode -> {
            val values = this.`val` == other.`val`
            val left = foo(left, other.left)
            val right = foo(right, other.right)

            values && left && right
        }
        else -> false
    }
}

