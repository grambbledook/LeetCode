package com.github.grambbledook.kotlin.task210

import com.github.grambbledook.java.task210.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CourseScheduleTwoTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.findOrder(2, arrayOf(intArrayOf(1, 0)))

        Assertions.assertArrayEquals(intArrayOf(0, 1), result)
    }

    @Test
    fun `test case 2`() {
        val result = test.findOrder(4, arrayOf(intArrayOf(1, 0), intArrayOf(2,0), intArrayOf(3,1), intArrayOf(3,2)))

        Assertions.assertArrayEquals(intArrayOf(0, 1, 2, 3), result)
    }

    @Test
    fun `test case 3`() {
        val result = test.findOrder(2, arrayOf(intArrayOf(1, 0), intArrayOf(0,1)))

        Assertions.assertArrayEquals(intArrayOf(), result)
    }

    @Test
    fun `test case 4`() {
        val result = test.findOrder(3, arrayOf(intArrayOf(0, 1), intArrayOf(0,2), intArrayOf(1, 2)))

        Assertions.assertArrayEquals(intArrayOf(2, 1, 0), result)
    }


}