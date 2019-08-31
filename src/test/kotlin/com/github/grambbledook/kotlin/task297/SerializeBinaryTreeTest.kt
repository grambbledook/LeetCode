package com.github.grambbledook.kotlin.task297

import com.github.grambbledook.java.task297.Codec
import com.github.grambbledook.kotlin.common.tree
import com.github.grambbledook.kotlin.common.left
import com.github.grambbledook.kotlin.common.right
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SerializeBinaryTreeTest {

    private val codec = Codec()

    @Test
    fun `test case 0`() {
        val input = null
        val result = codec.serialize(input)

        Assertions.assertEquals("null", result)
    }

    @Test
    fun `test case 1`() {
        val input = tree(1)
        val result = codec.serialize(input)

        Assertions.assertEquals("1 null null", result.trim())
    }

    @Test
    fun `test case 2`() {
        val input = tree(1).left { tree(2) }.right { tree(3) }
        val result = codec.serialize(input)

        Assertions.assertEquals("1 2 null null 3 null null", result.trim())
    }


    @Test
    fun `test case 3`() {
        val input = tree(1).left { tree(2) }.right { tree(3).left { tree(4) }.right { tree(5) } }
        val result = codec.serialize(input)
        Assertions.assertEquals("1 2 null null 3 4 null null 5 null null", result.trim())

    }

    @Test
    fun `test case 4`() {
        val input = tree(5).left { tree(2) }.right { tree(3).left { tree(2).left{tree(3)}.right{tree(1)} }.right { tree(4) } }
        val result = codec.serialize(input)
        Assertions.assertEquals("5 2 null null 3 2 3 null null 1 null null 4 null null", result.trim())

    }

}