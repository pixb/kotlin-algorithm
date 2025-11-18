import com.pix.exercises.bubbleSort
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BubbleSortTest {

    // Test normality
    @Test
    fun bubbleSortNormality() {
        val arr = intArrayOf(64, 34, 25, 12, 22, 11, 90)
        val expected = intArrayOf(11, 12, 22, 25, 34, 64, 90)
        Assertions.assertArrayEquals(expected, bubbleSort(arr))
    }
}