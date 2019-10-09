package com.github.grambbledook.kotlin.task143

import com.github.grambbledook.java.task143.Solution
import com.github.grambbledook.kotlin.common.list
import com.github.grambbledook.kotlin.common.toIntArray
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ReorderListTest {

    val test = Solution()

    @Test
    fun `test case 0`() {
        test.reorderList(null)
    }


    @Test
    fun `test case 1`() {
        val list = list(1, 2, 3, 4, 5, 6, 7)
        test.reorderList(list)

        Assertions.assertArrayEquals(intArrayOf(1, 7, 2, 6, 3, 5, 4), list.toIntArray())
    }

    @Test
    fun `test case 2`() {
        val list = list(1, 2, 3, 4)
        test.reorderList(list)

        Assertions.assertArrayEquals(intArrayOf(1, 4, 2, 3), list.toIntArray())
    }

    @Test
    fun `test case 3`() {
        val list = list(1, 2)
        test.reorderList(list)

        Assertions.assertArrayEquals(intArrayOf(1, 2), list.toIntArray())
    }

    @Test
    fun `test case 4`() {
        val list = list(1, 2, 3)
        test.reorderList(list)

        Assertions.assertArrayEquals(intArrayOf(1, 3, 2), list.toIntArray())
    }

    @Test
    fun `test case 5`() {
        val list = list(1)
        test.reorderList(list)

        Assertions.assertArrayEquals(intArrayOf(1), list.toIntArray())
    }

}