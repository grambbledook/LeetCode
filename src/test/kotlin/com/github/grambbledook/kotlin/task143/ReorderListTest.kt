package com.github.grambbledook.kotlin.task143

import com.github.grambbledook.java.task143.ReorderList
import com.github.grambbledook.java.task143.Solution as Base
import com.github.grambbledook.java.task143.reverse.Solution as Reverse
import com.github.grambbledook.kotlin.common.list
import com.github.grambbledook.kotlin.common.toIntArray
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

class ReorderListTest {

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 0`(test: ReorderList) {
        test.reorderList(null)
    }


    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 1`(test: ReorderList) {
        val list = list(1, 2, 3, 4, 5, 6, 7)
        test.reorderList(list)

        Assertions.assertArrayEquals(intArrayOf(1, 7, 2, 6, 3, 5, 4), list.toIntArray())
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 2`(test: ReorderList) {
        val list = list(1, 2, 3, 4)
        test.reorderList(list)

        Assertions.assertArrayEquals(intArrayOf(1, 4, 2, 3), list.toIntArray())
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 3`(test: ReorderList) {
        val list = list(1, 2)
        test.reorderList(list)

        Assertions.assertArrayEquals(intArrayOf(1, 2), list.toIntArray())
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 4`(test: ReorderList) {
        val list = list(1, 2, 3)
        test.reorderList(list)

        Assertions.assertArrayEquals(intArrayOf(1, 3, 2), list.toIntArray())
    }

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `test case 5`(test: ReorderList) {
        val list = list(1)
        test.reorderList(list)

        Assertions.assertArrayEquals(intArrayOf(1), list.toIntArray())
    }

}

class Args : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
        return Stream.of(
                Arguments.of(Base()),
                Arguments.of(Reverse())
        )
    }

}