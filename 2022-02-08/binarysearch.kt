class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0;
        var right = nums.lastIndex;

        while(left <= right) {
            val center = (left + right) / 2;

            if(nums[center] == target) return center
            else if(nums[center] > target) {
                right = center - 1;
            } else {
                left = center + 1;
            }
        }

        return -1;
    }
}
