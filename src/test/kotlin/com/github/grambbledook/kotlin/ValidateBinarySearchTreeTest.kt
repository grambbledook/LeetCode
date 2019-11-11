package com.github.grambbledook.kotlin

import com.github.grambbledook.java.task98.ValidateBst
import com.github.grambbledook.kotlin.common.Ints.left
import com.github.grambbledook.kotlin.common.Ints.right
import com.github.grambbledook.kotlin.common.tree
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream
import com.github.grambbledook.java.task98.Solution as Iterative
import com.github.grambbledook.java.task98.recursive.Solution as Recursive
import com.github.grambbledook.kotlin.common.right as rightBranch

class ValidateBinarySearchTreeTest {

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 1`(test: ValidateBst) {
        val result = test.isValidBST(
                tree(2).left { 1 }
                        .right { 3 }
        )

        Assertions.assertTrue(result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 2`(test: ValidateBst) {
        val result = test.isValidBST(
                tree(2).left { 3 }
                        .right { 1 }
        )

        Assertions.assertFalse(result)
    }


    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 3`(test: ValidateBst) {
        val result = test.isValidBST(
                tree(2).left { 1 }
        )

        Assertions.assertTrue(result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 4`(test: ValidateBst) {
        val result = test.isValidBST(
                tree(1).right { 1 }
        )

        Assertions.assertFalse(result)
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 5`(test: ValidateBst) {
        val result = test.isValidBST(
                tree(10).left { 5 }
                        .rightBranch {
                            tree(15).left { 6 }.right { 20 }
                        }
        )

        Assertions.assertFalse(result)
    }
}

class Args : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
        return Stream.of(
                Arguments.of(Iterative()),
                Arguments.of(Recursive())
        )
    }
}