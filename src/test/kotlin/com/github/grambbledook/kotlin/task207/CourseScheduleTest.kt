package com.github.grambbledook.kotlin.task207

import com.github.grambbledook.java.task207.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CourseScheduleTest {
    val test = Solution()

    @Test
    fun `test case 1`() {
        val classes = arrayOf(
                intArrayOf(1, 0),
                intArrayOf(2, 6),
                intArrayOf(1, 7),
                intArrayOf(6, 4),
                intArrayOf(7, 0),
                intArrayOf(0, 5)
        )

        val result = test.canFinish(8, classes)
        Assertions.assertTrue(result)
    }


    @Test
    fun `test case 2`() {
        val result = test.canFinish(2, arrayOf(intArrayOf(1, 0)))
        Assertions.assertTrue(result)
    }

    @Test
    fun `test case 3`() {
        val classes = arrayOf(
                intArrayOf(1, 0),
                intArrayOf(0, 1)
        )

        val result = test.canFinish(2, classes)
        Assertions.assertFalse(result)
    }

    @Test
    fun `test case 4`() {
        val classes = arrayOf<IntArray>()

        val result = test.canFinish(1, classes)
        Assertions.assertTrue(result)
    }


    @Test
    fun `test case 5`() {
        val classes = arrayOf(
                intArrayOf(0, 1),
                intArrayOf(1, 0)
        )

        val result = test.canFinish(2, classes)
        Assertions.assertFalse(result)
    }

    @Test
    fun `test case 6`() {
        val classes = arrayOf(
                intArrayOf(1, 0)
        )

        val result = test.canFinish(3, classes)
        Assertions.assertTrue(result)
    }

}