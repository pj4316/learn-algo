class Solution {
           fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val arr1 = nums1.sortedArray();
        val arr2 = nums2.sortedArray();

        var i = 0;
        var j = 0;

        val result = mutableListOf<Int>()
        while(i <= arr1.lastIndex && j <= arr2.lastIndex) {
            if(arr1[i] == arr2[j]) {
                result.add(arr1[i]);
                i++;
                j++;
            } else if(arr1[i] > arr2[j]) {
                j++;
            } else {
                i++;
            }
        }

        return result.toIntArray();
    }
}
