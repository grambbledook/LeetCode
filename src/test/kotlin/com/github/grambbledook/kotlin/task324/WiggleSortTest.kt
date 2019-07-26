package com.github.grambbledook.kotlin.task324

import com.github.grambbledook.java.task324.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class WiggleSortTest {
    private val test = Solution()

    @Test
    fun `test case 1`() {
        doTest(listOf(1, 5, 1, 1, 6, 4))
    }

    @Test
    fun `test case 2`() {
        doTest(listOf(1, 3, 2, 2, 3, 1))
    }

    @Test
    fun `test case 3`() {
        doTest(listOf(1, 1, 2, 1, 2, 2, 1))
    }

    @Test
    fun `test case 4`() {
        doTest(listOf(1, 3, 2, 2, 2, 1, 1, 3, 1, 1, 2))
    }

    @Test
    fun `test case 5`() {
        doTest(listOf(4, 5, 5, 6))
    }

    @Test
    fun `test case 6`() {
        doTest(listOf(4, 5, 5, 5, 5, 6, 6, 6))
    }

    @Test
    fun `test case 7`() {
        doTest(listOf(5, 3, 1, 2, 6, 7, 8, 5, 5))
    }

    @Test
    fun `test case 8`() {
        doTest(listOf(1, 1, 2, 2, 2, 1))
    }

    @Test
    fun `test case 9`() {
        doTest(listOf(2, 3, 3, 2, 2, 2, 1, 1))
    }

    @Test
    fun `test case 10`() {
        doTest(listOf(3, 3, 3, 2, 2, 2, 3, 2, 1, 1, 2, 1, 2, 3, 3, 3, 1, 2))
    }

    @Test
    fun `test case 11`() {
        doTest(listOf(3))
    }

    private fun doTest(orig: List<Int>) {
        val array = orig.toIntArray()
        test.wiggleSort(array).also {
            assertWiggled(array, orig)
        }
    }

    private fun assertWiggled(nums: IntArray, orig: List<Int>) {
        var last = nums[0]
        val delta = orig.toMutableList()
        for (i in 1 until nums.size) {
            val invariant = if (i % 2 == 1) last < nums[i] else last > nums[i]
            delta.remove(last)
            last = nums[i]

            Assertions.assertTrue(invariant, "${nums.toList()}. Array size: ${nums.size}")
        }
        delta.remove(nums.last())
        Assertions.assertTrue(delta.isEmpty(), "original $orig, wiggled ${nums.toList()} remaining elements $delta")

    }

}

