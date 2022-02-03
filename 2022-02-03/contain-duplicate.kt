/**
* Runtime: 708 ms
* Memory Usage: 71.8 MB
*/

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val map = mutableMapOf<Int, Int>();
        nums.forEach { it ->
            if (map.containsKey(it)) return true
            map.put(it,it);
        }
        
        return false;
    }
}

/**
* Runtime: 372 ms, faster than 80.64% of Kotlin online submissions for Contains Duplicate.
* Memory Usage: 49 MB, less than 78.68% of Kotlin online submissions for Contains Duplicate.
*/
class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>();
        nums.forEach { it -> if (!set.add(it)) return true }
        
        return false;
    }
}
