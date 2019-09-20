package com.github.grambbledook.kotlin.task77

import com.github.grambbledook.java.task77.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CombinationsTest {


    val test = Solution()

    @Test
    fun `test case 1`() {
        val expected = mutableListOf(listOf(1), listOf(2))
        test.doTest(2, 1, expected)
    }

    @Test
    fun `test case 2`() {
        val expected = mutableListOf(listOf(1,2), listOf(1, 3), listOf(1,4), listOf(2,3), listOf(2, 4), listOf(3, 4))
        test.doTest(4, 2, expected)
    }

    private fun Solution.doTest(input: Int, n: Int, expected: MutableList<List<Int>>) {
        val result = combine(input, n)
        result.asSequence().forEach { expected.remove(it) }
        Assertions.assertTrue(expected.isEmpty(), "Remaining elements: $expected")
    }

}