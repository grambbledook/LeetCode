package com.github.grambbledook.kotlin.task380

import com.github.grambbledook.java.task380.RandomizedSet
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RandomizedSetTest {
    val test = RandomizedSet()

    @Test
    fun `test case 1`() {
        Assertions.assertTrue(test.insert(0))
        Assertions.assertTrue(test.insert(1))
        Assertions.assertTrue(test.remove(0))
        Assertions.assertTrue(test.remove(1))
        Assertions.assertTrue(test.insert(2))
        Assertions.assertEquals(2, test.random)
    }

    @Test
    fun `test case 2`() {
        Assertions.assertTrue(test.insert(0))
        Assertions.assertTrue(test.remove(0))
        Assertions.assertTrue(test.insert(-1))
        Assertions.assertFalse(test.remove(0))
        Assertions.assertEquals(-1, test.random)
        Assertions.assertEquals(-1, test.random)
        Assertions.assertEquals(-1, test.random)
        Assertions.assertEquals(-1, test.random)
        Assertions.assertEquals(-1, test.random)
        Assertions.assertEquals(-1, test.random)
        Assertions.assertEquals(-1, test.random)
        Assertions.assertEquals(-1, test.random)
        Assertions.assertEquals(-1, test.random)
        Assertions.assertEquals(-1, test.random)
        Assertions.assertEquals(-1, test.random)
    }

}