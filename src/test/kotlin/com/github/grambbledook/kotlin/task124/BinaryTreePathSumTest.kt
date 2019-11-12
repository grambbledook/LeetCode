package com.github.grambbledook.kotlin.task124

import com.github.grambbledook.java.task124.Solution
import com.github.grambbledook.kotlin.common.left as leftBranch
import com.github.grambbledook.kotlin.common.right as rightBranch
import com.github.grambbledook.kotlin.common.Ints.left
import com.github.grambbledook.kotlin.common.Ints.right
import com.github.grambbledook.kotlin.common.tree
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BinaryTreePathSumTest {

    val test = Solution()

    @Test
    fun `test case 0`() {
        val result = test.maxPathSum(tree(1))

        Assertions.assertEquals(1, result)
    }

    @Test
    fun `test case 1`() {
        val result = test.maxPathSum(tree(2).left { 1 }.right { 3 })

        Assertions.assertEquals(6, result)
    }

    @Test
    fun `test case 2`() {
        val tree = tree(100)
                .right { 3 }
                .leftBranch {
                    tree(-10).right { 5 }
                            .left { 5 }
                }

        val result = test.maxPathSum(tree)
        Assertions.assertEquals(103, result)
    }

    @Test
    fun `test case 3`() {
        val tree = tree(-10)
                .left { 9 }
                .rightBranch {
                    tree(20).right { 7 }
                            .left { 15 }
                }

        val result = test.maxPathSum(tree)
        Assertions.assertEquals(42, result)
    }

    @Test
    fun `test case 4`() {
        val tree = tree(5)
                .leftBranch {
                    tree(4).leftBranch {
                        tree(11).left { 7 }
                                .right { 2 }
                    }
                }
                .rightBranch {
                    tree(8).left { 13 }
                            .rightBranch {
                                tree(4).right { 1 }
                            }
                }

        val result = test.maxPathSum(tree)
        Assertions.assertEquals(48, result)
    }

}