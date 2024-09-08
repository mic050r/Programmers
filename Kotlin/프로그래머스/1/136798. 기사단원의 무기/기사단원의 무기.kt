class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        return IntArray(number) { getCount(it + 1) }.fold(0) { acc, v ->
            if (v > limit) acc + power
            else acc + v
        }
    }

    private fun getCount(n: Int): Int {
        var count = 0
        var i = 1
        while (i * i < n) {
            if (n % i++ == 0) count += 2
        }
        if (i * i == n) count++
        return count
    }
}
