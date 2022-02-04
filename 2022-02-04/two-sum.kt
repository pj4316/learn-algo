// brute force
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for(i in 0..nums.lastIndex) {
            for(j in i+1..nums.lastIndex) {
                if(nums[i] + nums[j] == target) {
                    return listOf(i,j).toIntArray()
                };

            }
        }
        return IntArray(1);
    }
}

// 1loop hashmap
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>();
        nums.forEachIndexed { index, i ->
            val remain = target - i;
            if (map.contains(remain)) {
                return listOf(map[remain]!!, index).toIntArray();
            }
            map[i] = index;
        }
        return IntArray(1);
    }
}
