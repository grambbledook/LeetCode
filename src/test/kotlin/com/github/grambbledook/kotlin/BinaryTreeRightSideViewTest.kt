package com.github.grambbledook.kotlin

import com.github.grambbledook.kotlin.common.left
import com.github.grambbledook.kotlin.common.right
import com.github.grambbledook.kotlin.common.tree
import com.github.grambbledook.leetcode.task199.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BinaryTreeRightSideViewTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val tree = tree(1)
                .left {
                    tree(2).right { tree(5) }
                }
                .right {
                    tree(3).right { tree(4) }
                }

        val result = test.rightSideView(tree)
        Assertions.assertEquals(listOf(1, 3, 4), result)
    }
}