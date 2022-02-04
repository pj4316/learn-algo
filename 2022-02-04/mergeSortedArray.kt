class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        val a = nums1.take(m)
        val b = nums2.take(n);

        var i = 0;
        var j = 0;

        while (i < m || j < n) {
            if (i == m) {
                nums1[i + j] = b[j++];
            } else if (j == n) {
                nums1[i + j] = a[i++];
            } else if (a[i] < b[j]) {
                nums1[i + j] = a[i++]
            } else if (a[i] > b[j]) {
                nums1[i + j] = b[j++]
            } else {
                nums1[i + j] = a[i++]
                nums1[i + j] = b[j++]
            }
        }
    }
}
