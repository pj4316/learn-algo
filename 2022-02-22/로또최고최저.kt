//https://programmers.co.kr/learn/courses/30/lessons/77484
class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        return intArrayOf(
            (lottos.size.plus(1)) - lottos.count { win_nums.contains(it) || it == 0 },
            (lottos.size.plus(1)) - lottos.count { win_nums.contains(it) }
        ).map { if(it > 6) 6 else it }.toIntArray()
    }
}
