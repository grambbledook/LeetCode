package com.github.grambbledook.kotlin.task42

import com.github.grambbledook.java.task42.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TrappingRainWaterTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.trap(intArrayOf(0,1,0,2,1,0,1,3,2,1,2,1))

        Assertions.assertEquals(6, result)
    }


    @Test
    fun `test case 2`() {
        val result = test.trap(intArrayOf(4))

        Assertions.assertEquals(0, result)
    }

    @Test
    fun `test case 3`() {
        val result = test.trap(intArrayOf(4, 1))

        Assertions.assertEquals(0, result)
    }

    @Test
    fun `test case 4`() {
        val result = test.trap(null)

        Assertions.assertEquals(0, result)
    }

}