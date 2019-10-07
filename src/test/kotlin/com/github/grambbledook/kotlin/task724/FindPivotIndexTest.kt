package com.github.grambbledook.kotlin.task724

import com.github.grambbledook.java.task724.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FindPivotIndexTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6))
        Assertions.assertEquals(3, result)
    }

    @Test
    fun `test case 2`() {
        val result = test.pivotIndex(intArrayOf(1, 2, 3))
        Assertions.assertEquals(-1, result)
    }

    @Test
    fun `test case 3`() {
        val result = test.pivotIndex(intArrayOf(-1, -1, -1, 0, 1, 1))
        Assertions.assertEquals(0, result)
    }
}