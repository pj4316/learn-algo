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

//

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>();
        nums.forEach { it -> if (!set.add(it)) return true }
        
        return false;
    }
}
