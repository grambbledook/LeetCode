package com.github.grambbledook.kotlin.task652

import com.github.grambbledook.java.task652.Solution
import com.github.grambbledook.kotlin.common.tree
import com.github.grambbledook.kotlin.common.left
import com.github.grambbledook.kotlin.common.right
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FindDuplicateSubtreesTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val input = tree(1)
        val result = test.findDuplicateSubtrees(input)

        Assertions.assertTrue(result.isEmpty())
    }


    @Test
    fun `test case 2`() {
        val input = tree(1).left{tree(2)} .right { tree(2)}
        val result = test.findDuplicateSubtrees(input)

        Assertions.assertEquals(2, result[0].`val`)
        Assertions.assertNull(result[0].left)
        Assertions.assertNull(result[0].right)
    }

    @Test
    fun `test case 3`() {
        val input = tree(1).left{tree(2).left { tree(4) }} .right { tree(3).left { tree(2).left { tree(4) } }.right{ tree(4)}}
        val result = test.findDuplicateSubtrees(input)

        Assertions.assertEquals(2, result.size)
    }

}