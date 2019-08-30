package com.github.grambbledook.kotlin.task297

import com.github.grambbledook.java.task297.Codec
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DeserializeBinaryTreeTest {

    private val codec = Codec()

    @Test
    fun `test case 0`() {
        val input = "null"
        val result = codec.deserialize(input)

        Assertions.assertNull(result)
    }

    @Test
    fun `test case 1`() {
        val input = "1 null null"
        val result = codec.deserialize(input)

        Assertions.assertEquals(1, result.`val`)
    }

    @Test
    fun `test case 2`() {
        val input = "1 2 null null null"
        val result = codec.deserialize(input)

        Assertions.assertEquals(1, result.`val`)
        Assertions.assertEquals(2, result.left.`val`)
        Assertions.assertNull(result.right  )
    }

    @Test
    fun `test case 3`() {
        val input = "1 2 null null 3 4 null null 5 null null"
        val result = codec.deserialize(input)

        Assertions.assertEquals(1, result.`val`)
        Assertions.assertEquals(2, result.left.`val`)
        Assertions.assertEquals(4, result.right.left.`val`)
        Assertions.assertEquals(5, result.right.right.`val`)
    }

    @Test
    fun `test case 6`() {
        val input = "5 2 null null 3 2 3 null null 1 null null 4 null null"
        val result = codec.deserialize(input)

        Assertions.assertEquals(5, result.`val`)

        //left branch
        Assertions.assertEquals(2, result.left.`val`)
        Assertions.assertNull(result.left.left)
        Assertions.assertNull(result.left.right)

        //right branch
        Assertions.assertEquals(3, result.right.`val`)
        Assertions.assertEquals(2, result.right.left.`val`)
        Assertions.assertEquals(4, result.right.right.`val`)

        //right-left branch
        Assertions.assertEquals(3, result.right.left.left.`val`)
        Assertions.assertEquals(1, result.right.left.right.`val`)
    }
}