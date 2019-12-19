package com.github.grambbledook.kotlin.task979

import com.github.grambbledook.java.task979.Solution
import com.github.grambbledook.kotlin.common.Ints.left
import com.github.grambbledook.kotlin.common.Ints.right
import com.github.grambbledook.kotlin.common.tree
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DistributeCoinsBinaryTreeTest {

    val test = Solution()

    @Test
    fun `test case 1`(){
        val result = test.distributeCoins(tree(3).left { 0 }.right { 0 })
        Assertions.assertEquals(2, result)
    }

}