package com.github.grambbledook.kotlin.task217

import com.github.grambbledook.java.task217.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ContainsDuplicateTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val input = intArrayOf(1, 2, 3, 1)
        val result = test.containsDuplicate(input)

        Assertions.assertEquals(true, result)
    }

    @Test
    fun `test case 2`() {
        val input = intArrayOf(1, 2, 3, 4)
        val result = test.containsDuplicate(input)

        Assertions.assertEquals(false, result)
    }

    @Test
    fun `test case 3`() {
        val input = intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)
        val result = test.containsDuplicate(input)

        Assertions.assertEquals(true, result)
    }

}