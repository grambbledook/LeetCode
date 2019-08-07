package com.github.grambbledook.kotlin.task138

import com.github.grambbledook.java.task138.Solution
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.extension.ExtensionContext
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.ArgumentsProvider
import org.junit.jupiter.params.provider.ArgumentsSource
import java.util.stream.Stream

class CopyListRandomPointerTest {

    val test = Solution()

    @ParameterizedTest
    @ArgumentsSource(Args::class)
    fun `Test deep copy of list returned`(head: Solution.Node) {
        val copy = test.copyRandomList(head)
        assertDeepCopy(head, copy)
    }

    private fun assertDeepCopy(head: Solution.Node?, copy: Solution.Node?) {
        val asserted = HashSet<Solution.Node>()

        fun assertEquals(head: Solution.Node?, copy: Solution.Node?) {

            if (head == null) {
                Assertions.assertNull(copy)
                return
            }

            if (asserted.contains(head)) return

            Assertions.assertEquals(head.`val`, copy?.`val`)
            Assertions.assertNotEquals(System.identityHashCode(head), System.identityHashCode(copy))

            asserted.add(head)

            assertEquals(head.next, copy?.next)
            assertEquals(head.random, copy?.random)
        }

        assertEquals(head, copy)
    }

}

class Args : ArgumentsProvider {
    override fun provideArguments(context: ExtensionContext?): Stream<out Arguments> {
        return Stream.of(
                Arguments.of(Solution.Node().apply {
                    `val` = 1
                    next = Solution.Node().apply { `val` = 2; next = null; random = this }
                    random = next
                })
        )
    }
}