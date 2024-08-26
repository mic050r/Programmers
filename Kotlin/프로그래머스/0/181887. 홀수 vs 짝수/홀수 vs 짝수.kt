import kotlin.math.*

class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        return max(
            num_list.filterIndexed { i, v -> i % 2 == 0}.sum(),
            num_list.filterIndexed { i, v -> i % 2 == 1}.sum()
        )
    }
}