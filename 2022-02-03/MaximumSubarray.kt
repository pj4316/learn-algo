/**
* 연속적인 배열만 보기 때문에, 최대 가능한 합계 = max(sum of previous sub array + current, current)
*/

import kotlin.math.max

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        val result = nums.toMutableList();
        var maxValue = Int.MIN_VALUE;
        nums.forEachIndexed { index, i ->
            val sums = if(index>0) result[index-1] + i else i;
            val maxNum = max(sums,i);
            maxValue = max(maxValue, maxNum);
            result[index] = maxNum
        }
        return maxValue;
    }
}
