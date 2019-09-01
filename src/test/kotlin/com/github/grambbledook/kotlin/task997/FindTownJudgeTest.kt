package com.github.grambbledook.kotlin.task997

import com.github.grambbledook.java.task997.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class FindTownJudgeTest {

    val  test = Solution()

    @Test
    fun `test case 0`() {
        val input = arrayOf<IntArray>()
        val result = test.findJudge(1, input)

        Assertions.assertEquals(1, result)
    }

    @Test
    fun `test case 1`() {
        val input = arrayOf(intArrayOf(1, 2))
        val result = test.findJudge(2, input)

        Assertions.assertEquals(2, result)
    }

    @Test
    fun `test case 2`() {
        val input = arrayOf(intArrayOf(1, 3), intArrayOf(2, 3))
        val result = test.findJudge(3, input)

        Assertions.assertEquals(3, result)
    }

    @Test
    fun `test case 3`() {
        val input = arrayOf(intArrayOf(1, 3), intArrayOf(2, 3), intArrayOf(3, 1))
        val result = test.findJudge(3, input)

        Assertions.assertEquals(-1, result)
    }

    @Test
    fun `test case 4`() {
        val input = arrayOf(intArrayOf(1, 2), intArrayOf(2, 3))
        val result = test.findJudge(3, input)

         Assertions.assertEquals(-1, result)
    }

    @Test
    fun `test case 5`() {
        val input = arrayOf(intArrayOf(1, 3), intArrayOf(1,4), intArrayOf(2, 3), intArrayOf(2, 4), intArrayOf(4, 3))
        val result = test.findJudge(4, input)

         Assertions.assertEquals(3, result)
    }


    @Test
    fun `test case 6`() {
        val input = arrayOf(
                intArrayOf(1,8), intArrayOf(1,3), intArrayOf(2,8), intArrayOf(2,3),
                intArrayOf(4,8), intArrayOf(4,3), intArrayOf(5,8), intArrayOf(5,3),
                intArrayOf(6,8), intArrayOf(6,3), intArrayOf(7,8), intArrayOf(7,3),
                intArrayOf(9,8), intArrayOf(9,3), intArrayOf(11,8), intArrayOf(11,3)
        )
        val result = test.findJudge(11, input)

         Assertions.assertEquals(-1, result)
    }

}