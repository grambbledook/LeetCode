package com.github.grambbledook.kotlin.task324

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class WiggleSortTest {
    val test = Solution

    @Test
    fun `test case 1`() {
        listOf(1, 5, 1, 1, 6, 4).let { orig ->
            test.wiggleSort(orig.toIntArray()).also {
                assertWiggled(it, orig)
            }
        }
    }

    @Test
    fun `test case 2`() {
        listOf(1, 3, 2, 2, 3, 1).let { orig ->
            test.wiggleSort(orig.toIntArray()).also {
                assertWiggled(it, orig)
            }
        }
    }

    @Test
    fun `test case 3`() {
        listOf(1, 1, 2, 1, 2, 2, 1).let { orig ->
            test.wiggleSort(orig.toIntArray()).also {
                assertWiggled(it, orig)
            }
        }
    }

    @Test
    fun `test case 4`() {
        listOf(1, 3, 2, 2, 2, 1, 1, 3, 1, 1, 2).let { orig ->
            test.wiggleSort(orig.toIntArray()).also {
                assertWiggled(it, orig)
            }
        }
    }

    @Test
    fun `test case 5`() {
        listOf(4, 5, 5, 6).let { orig ->
            test.wiggleSort(orig.toIntArray()).also {
                assertWiggled(it, orig)
            }
        }
    }

    @Test
    fun `test case 6`() {
        listOf(4, 5, 5, 5, 5, 6, 6, 6).let { orig ->
            test.wiggleSort(orig.toIntArray()).also {
                assertWiggled(it, orig)
            }
        }
    }

    @Test
    fun `test case 7`() {
        listOf(5, 3, 1, 2, 6, 7, 8, 5, 5).let { orig ->
            test.wiggleSort(orig.toIntArray()).also {
                assertWiggled(it, orig)
            }
        }
    }

    @Test
    fun `test case 8`() {
        listOf(1, 1, 2, 2, 2, 1).let { orig ->
            test.wiggleSort(orig.toIntArray()).also {
                assertWiggled(it, orig)
            }
        }
    }

    @Test
    fun `test case 9`() {
        listOf(2, 3, 3, 2, 2, 2, 1, 1).let { orig ->
            test.wiggleSort(orig.toIntArray()).also {
                assertWiggled(it, orig)
            }
        }
    }

    @Test
    fun `test case 10`() {
        listOf(3, 3, 3, 2, 2, 2, 3, 2, 1, 1, 2, 1, 2, 3, 3, 3, 1, 2).let { orig ->
            test.wiggleSort(orig.toIntArray()).also {
                assertWiggled(it, orig)
            }
        }
    }

    fun assertWiggled(nums: IntArray, orig: List<Int>) {
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

