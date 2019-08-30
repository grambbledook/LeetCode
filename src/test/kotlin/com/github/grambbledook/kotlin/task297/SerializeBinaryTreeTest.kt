package com.github.grambbledook.kotlin.task297

import com.github.grambbledook.java.task297.Codec
import com.github.grambbledook.java.task297.TreeNode
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SerializeBinaryTreeTest {

    private val codec = Codec()

    @Test
    fun `test case 0`() {
        val input = null
        val result = codec.serialize(input)

        Assertions.assertEquals("", result)
    }

    @Test
    fun `test case 1`() {
        val input = tree(1)
        val result = codec.serialize(input)

        Assertions.assertEquals("0,1,1,2", result)
    }

    @Test
    fun `test case 2`() {
        val input = tree(1).left { tree(2) }.right { tree(3) }
        val result = codec.serialize(input)

        Assertions.assertEquals("0,1,1,2 2,3,3,4 1,2,5,6", result)
    }


    @Test
    fun `test case 3`() {
        val input = tree(1).left { tree(2) }.right { tree(3).left { tree(4) }.right { tree(5) } }
        val result = codec.serialize(input)
        Assertions.assertEquals("0,1,1,2 2,3,3,4 4,5,5,6 3,4,7,8 1,2,9,10", result)

    }

    @Test
    fun `test case 4`() {
        val input = tree(5).left { tree(2) }.right { tree(3).left { tree(2).left{tree(3)}.right{tree(1)} }.right { tree(4) } }
        val result = codec.serialize(input)
        Assertions.assertEquals("0,5,1,2 2,3,3,4 4,4,5,6 3,2,7,8 8,1,9,10 7,3,11,12 1,2,13,14", result)

    }

    private fun tree(value: Int): TreeNode {
        return TreeNode(value)
    }

    fun TreeNode.left(f: () -> TreeNode): TreeNode {
        return this.apply { this.left = f() }
    }

    fun TreeNode.right(f: () -> TreeNode): TreeNode {
        return this.apply { right = f() }
    }

}