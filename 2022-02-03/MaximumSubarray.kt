/**
* 연속적인 배열만 보기 때문에, 최대 가능한 합계 = max(sum of previous sub array + current, current)
*/
import kotlin.math.max

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var maxValue = Int.MIN_VALUE;
        var current = 0;
        nums.forEach { i ->
            current = max(current + i,i);
            maxValue = max(maxValue, current);
        }
        return maxValue;
    }
}
