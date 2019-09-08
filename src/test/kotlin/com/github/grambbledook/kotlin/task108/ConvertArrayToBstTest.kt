package com.github.grambbledook.kotlin.task108

import com.github.grambbledook.java.task108.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ConvertArrayToBstTest {


    val test = Solution()


    @Test
    fun `test case 1`() {
        val input = intArrayOf(1, 2, 3)
        val result = test.sortedArrayToBST(input)

        Assertions.assertEquals(2, result.`val`)
        Assertions.assertEquals(1, result.left.`val`)
        Assertions.assertEquals(3, result.right.`val`)

    }

    @Test
    fun `test case 2`() {
        val input = intArrayOf(-10, -3, 0, 5, 9)
        val result = test.sortedArrayToBST(input)

        Assertions.assertEquals(0, result.`val`)
        Assertions.assertEquals(-10, result.left.`val`)
        Assertions.assertEquals(-3, result.left.right.`val`)
        Assertions.assertEquals(5, result.right.`val`)
        Assertions.assertEquals(9, result.right.right.`val`)

    }

    @Test
    fun `test case 3`() {
        val input = intArrayOf(1, 2, 3, 4)
        val result = test.sortedArrayToBST(input)

        Assertions.assertEquals(2, result.`val`)
        Assertions.assertEquals(1, result.left.`val`)
        Assertions.assertEquals(3, result.right.`val`)
        Assertions.assertEquals(4, result.right.right.`val`)

    }


}