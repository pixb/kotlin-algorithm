import com.pix.exercises.fibonacci
import org.junit.jupiter.api.Assertions.assertArrayEquals
import kotlin.test.Test


class FibonacciTest {

    @Test
    fun fibonacciTest() {
        val n = 10
        val arr = IntArray(n)
        for (i in 0 until n) {
            arr[i] = fibonacci(i)
        }
        val expected = intArrayOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)
        assertArrayEquals(expected, arr)
    }
}