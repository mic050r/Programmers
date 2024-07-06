class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val win = win_nums.toHashSet()
        var max = 0
        var min = 0
        lottos.forEach {
            if(it == 0) max++
            if(win.contains(it)) {
                min++
                max++
            }
        }
        fun rank(n:Int) : Int = if(n < 2) 6 else 7-n
        return intArrayOf(rank(max), rank(min))
    }
}