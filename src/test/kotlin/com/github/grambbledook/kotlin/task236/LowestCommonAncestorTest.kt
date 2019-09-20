package com.github.grambbledook.kotlin.task236

import com.github.grambbledook.java.task236.Solution
import com.github.grambbledook.kotlin.common.left
import com.github.grambbledook.kotlin.common.right
import com.github.grambbledook.kotlin.common.tree
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LowestCommonAncestorTest {

    val test = Solution()
    val input = tree(3)
            .right {
                tree(1).left { tree(0) }
                        .right { tree(8) }
            }.left {
                tree(5).left { tree(6) }
                        .right {
                            tree(2).left { tree(7) }
                                    .right { tree(4) }
                        }
            }

    @Test
    fun `test case 1`() {
        val result = test.lowestCommonAncestor(input, tree(5), tree(1))
        Assertions.assertEquals(3, result.`val`)
    }

    @Test
    fun `test case 2`() {
        val result = test.lowestCommonAncestor(input, tree(5), tree(4))
        Assertions.assertEquals(5, result.`val`)
    }


}