package task701

import com.github.grambbledook.java.task701.Solution
import com.github.grambbledook.kotlin.common.left
import com.github.grambbledook.kotlin.common.right
import com.github.grambbledook.kotlin.common.tree
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class InsertInBstTest {

    val test = Solution()

    @Test
    fun `test case 1`() {
        val input = tree(2).left { tree(1) }.right{ tree(3) }

        val result = test.insertIntoBST(input, 4)
        Assertions.assertEquals(1, result.left.`val`)
        Assertions.assertEquals(2, result.`val`)
        Assertions.assertEquals(3, result.right.`val`)
        Assertions.assertEquals(4, result.right.right.`val`)
    }

    @Test
    fun `test case 2`() {
        val result = test.insertIntoBST(null, 4)
        Assertions.assertEquals(4, result.`val`)
    }
}