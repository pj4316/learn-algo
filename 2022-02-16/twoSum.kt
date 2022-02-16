class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>();
        nums.forEachIndexed{ i, n -> map[target - n] = i };

        nums.forEachIndexed { i, n ->
            val value = map.getOrDefault(n, Int.MIN_VALUE);
            if(value != Int.MIN_VALUE && value != i) return arrayListOf(i, value).toIntArray()
        }

        return emptyList<Int>().toIntArray();
    }
}
