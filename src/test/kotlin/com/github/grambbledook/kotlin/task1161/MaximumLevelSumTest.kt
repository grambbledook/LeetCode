package com.github.grambbledook.kotlin.task1161

import com.github.grambbledook.java.task1161.Solution
import com.github.grambbledook.kotlin.common.left
import com.github.grambbledook.kotlin.common.right
import com.github.grambbledook.kotlin.common.tree
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MaximumLevelSumTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val tree = tree(1).left {
                            tree(7).left { tree(7) }
                                   .right { tree(-8) } }
                           .right { tree(0) }

        val result = test.maxLevelSum(tree)
        Assertions.assertEquals(2, result)
    }
}