package com.github.grambbledook.kotlin.task206

import com.github.grambbledook.java.task206.Solution
import com.github.grambbledook.kotlin.common.list
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ReverseLinkedListTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val list = list(1, 2, 3)

        val result = test.reverseList(list)
        Assertions.assertEquals(3, result.`val`)
        Assertions.assertEquals(2, result.next.`val`)
        Assertions.assertEquals(1, result.next.next.`val`)
    }

    @Test
    fun `test case 2`() {
        val list = list(1)

        val result = test.reverseList(list)
        Assertions.assertEquals(1, result.`val`)
    }

    @Test
    fun `test case 3`() {
        val result = test.reverseList(null)
        Assertions.assertNull(result)
    }
}