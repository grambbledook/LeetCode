package com.github.grambbledook.kotlin.task226

import com.github.grambbledook.java.task226.Solution
import com.github.grambbledook.kotlin.common.left
import com.github.grambbledook.kotlin.common.right
import com.github.grambbledook.kotlin.common.tree
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class InvertBinaryTreeTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val input = tree(2).left { tree(1) }.right{ tree(3)}
        val result = test.invertTree(input)

        Assertions.assertEquals(1, result.right.`val`)
        Assertions.assertEquals(2, result.`val`)
        Assertions.assertEquals(3, result.left.`val`)
    }


    @Test
    fun `test case 2`() {
        val input = tree(2).left { tree(1) }.right{ tree(4).left{tree(3)}}
        val result = test.invertTree(input)

        Assertions.assertEquals(1, result.right.`val`)
        Assertions.assertEquals(2, result.`val`)
        Assertions.assertEquals(3, result.left.right.`val`)
        Assertions.assertEquals(4, result.left.`val`)
    }

}