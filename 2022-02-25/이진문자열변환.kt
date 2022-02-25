class Solution {
    fun solution(s: String): IntArray {

        var ss = s;
        var loopCount = 0;
        var zeroCount = 0;
        while(ss != "1") {
            val originLength = ss.length
            val length = ss.replace("0", "").length;
            zeroCount += originLength - length

            ss = length.toString(2);
            loopCount++
        }

        return arrayOf(loopCount, zeroCount).toIntArray();
    }
}
