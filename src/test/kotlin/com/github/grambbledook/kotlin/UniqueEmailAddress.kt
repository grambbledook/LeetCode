package com.github.grambbledook.kotlin

import com.github.grambbledook.leetcode.task929.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class UniqueEmailAddress {
    val test = Solution()

    @Test
    fun `test case 1`() {
        val result = test.numUniqueEmails(arrayOf("test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"))

        Assertions.assertEquals(2, result)
    }
}