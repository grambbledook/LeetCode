package com.github.grambbledook.kotlin.task324

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class WiggleSortTest {
    val test = Solution()


    @Test
    fun `test case 1`() {
        intArrayOf(1, 5, 1, 1, 6, 4).let {
            test.wiggleSort(it)
        }
    }

    @Test
    fun `test case 2`() {
        intArrayOf(1, 3, 2, 2, 3, 1).let {
            test.wiggleSort(it)
            assertWiggled(it)
        }
    }

    @Test
    fun `test case 3`() {
        intArrayOf(1, 1, 2, 1, 2, 2, 1).let {
            test.wiggleSort(it)
            assertWiggled(it)
        }
    }

    @Test
    fun `test case 4`() {
        intArrayOf(1, 3, 2, 2, 2, 1, 1, 3, 1, 1, 2).let {
            test.wiggleSort(it)
            assertWiggled(it)
        }
    }

    @Test
    fun `test case 5`() {
        intArrayOf(4, 5, 5, 6).let {
            test.wiggleSort(it)
            assertWiggled(it)
        }
    }

    @Test
    fun `test case 6`() {
        intArrayOf(4, 5, 5, 5, 5, 6, 6, 6).let {
            test.wiggleSort(it)
            assertWiggled(it)
        }
    }

    @Test
    fun `test case 7`() {
        intArrayOf(5, 3, 1, 2, 6, 7, 8, 5, 5).let {
            test.wiggleSort(it)
            assertWiggled(it)
        }
    }

    fun assertWiggled(nums: IntArray) {
        var last = nums[0]

        for (i in 1 until nums.size) {
            val invariant = if (i % 2 == 1) last < nums[i] else last > nums[i]
            last = nums[i]

            Assertions.assertTrue(invariant, "${nums.toList()}")
        }

    }

}

