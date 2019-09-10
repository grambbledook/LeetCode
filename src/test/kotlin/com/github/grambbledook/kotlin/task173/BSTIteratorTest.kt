package com.github.grambbledook.kotlin.task173

import com.github.grambbledook.java.task173.BSTIterator
import com.github.grambbledook.kotlin.common.left
import com.github.grambbledook.kotlin.common.right
import com.github.grambbledook.kotlin.common.tree
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BSTIteratorTest {


    lateinit var test: BSTIterator
    @Test
    fun `test case 1`() {
        test = BSTIterator(tree(1))

        assertNext(1)

        assertNoNext()
    }

    @Test
    fun `test case 2`() {

        val root = tree(3).left { tree(1).right { tree(2) } }.right { tree(5).left { tree(4) } }

        test = BSTIterator(root)

        for (i in 1..5) {
            assertNext(i)
        }

        assertNoNext()
    }

    @Test
    fun `test case 3`() {

        val root = tree(7).left { tree(3) }.right { tree(15).left { tree(9) }.right { tree(20) } }

        test = BSTIterator(root)

        assertNext(3)
        assertNext(7)
        assertNext(9)
        assertNext(15)
        assertNext(20)

        assertNoNext()
    }


    @Test
    fun `test case 4`() {
        val root = tree(4).left {
            tree(1).right {
                tree(2).right {
                    tree(3)
                }
            }
        }.right {
            tree(6).left {
                tree(5)
            }
        }

        test = BSTIterator(root)

        for (i in 1..6) {
            assertNext(i)
        }

        assertNoNext()
    }


    @Test
    fun `test case 5`() {
        val root = tree(4).left {
            tree(2).left { tree(1) }
                   .right { tree(3) }
        }

        test = BSTIterator(root)

        for (i in 1..4) {
            assertNext(i)
        }

        assertNoNext()
    }


    private fun assertNext(i: Int) {
        Assertions.assertTrue(test.hasNext())
        Assertions.assertEquals(i, test.next())
    }

    private fun assertNoNext() {
        Assertions.assertFalse(test.hasNext())
    }
}