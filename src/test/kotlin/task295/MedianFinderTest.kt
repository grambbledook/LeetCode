package task295

import com.github.grambbledook.java.task295.MedianFinder
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MedianFinderTest {
    val test = MedianFinder()


    @Test
    fun `test case 1`() {
        test.addNum(1)
        test.addNum(2)
        Assertions.assertEquals(1.5, test.findMedian())
        test.addNum(3)
        Assertions.assertEquals(2.0, test.findMedian())
    }

}