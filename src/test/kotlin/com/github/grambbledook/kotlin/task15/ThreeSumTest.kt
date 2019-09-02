package com.github.grambbledook.kotlin.task15

import com.github.grambbledook.java.task15.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ThreeSumTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val input = intArrayOf(-1, 0, 1)
        val result = test.threeSum(input)

        assertEquals(
                listOf(listOf(-1, 0, 1)),
                result
        )
    }

    @Test
    fun `test case 2`() {
        val input = intArrayOf(-1, 0, 1, 2, -1, 4)
        val result = test.threeSum(input)

        assertEquals(
                listOf(listOf(-1, -1, 2), listOf(-1, 0, 1)),
                result
        )
    }

    @Test
    fun `test case 3`() {
        val input = intArrayOf(3, 0, -2, -1, 1, 2)
        val result = test.threeSum(input)

        assertEquals(
                listOf(listOf(-2, -1, 3), listOf(-2, 0, 2), listOf(-1, 0, 1)),
                result
        )
    }

    @Test
    fun `test case 4`() {
        val input = intArrayOf(-2, 0, 1, 1, 2)
        val result = test.threeSum(input)

        assertEquals(
                listOf(listOf(-2, 0, 2), listOf(-2, 1, 1)),
                result
        )
    }

    @Test
    fun `test case 5`() {
        val input = intArrayOf(-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6)
        val result = test.threeSum(input)

        assertEquals(
                listOf(listOf(-4, -2, 6), listOf(-4, 0, 4), listOf(-4, 1, 3), listOf(-4, 2, 2), listOf(-2, -2, 4), listOf(-2, 0, 2)),
                result
        )
    }

    fun assertEquals(expected: List<List<Int>>, actual: List<List<Int>>) {
        Assertions.assertEquals(expected.size, actual.size, "Lists size are not equal:\n $expected\n $actual")

        val sorted = expected.map { it.sorted() }.toMutableList()

        actual.forEach { sorted.remove(it.sorted()) }

        Assertions.assertTrue(sorted.isEmpty(), "Remaining $sorted")
    }


}

