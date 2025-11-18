import com.pix.exercises.halfSearch
import kotlin.test.Test

class HalfSearchTest {
    @Test
    fun testHalfSearch() {
        val arr: List<Int> = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val target = 5
        val index = halfSearch(arr, target)
        assert(index == 4)
    }
}