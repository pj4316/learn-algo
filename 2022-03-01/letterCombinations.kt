class Solution {
    private val digitToAlpha = mapOf(
        2 to "abc",
        3 to "def",
        4 to "ghi",
        5 to "jkl",
        6 to "mno",
        7 to "pqrs",
        8 to "tuv",
        9 to "wxyz"
    )

    fun letterCombinations(digits: String): List<String> {
        /**
         * digits을 int array로 변환
         * [2,9] 범위로 필터링
         * 숫자 매핑된 입력키 맵으로 변환
         * list combination을 통해 결과값 합치기
         */

        val results = digits                // "23"
            .map { it.toString().toInt() }  // [2,3]
            .filter { it in 2..9 }          // [2,3]
            .map { digitToAlpha[it]!! }     // ["abc", "efg"]
            .map { it.map { c -> c.toString() }} // [["a","b","c"], ["e","f","g"]]
            .fold(listOf("")) { acc, i -> listCombinations(acc, i) }

        // abc * def
        // [ad ae af bd be bf cd ce cf] * abc
        // ....->

        return if (results.size == 1 && results.contains("")) {
            return emptyList()
        } else results
    }

    private fun listCombinations(list1: List<String>, list2: List<String>): List<String> {
        return list1
            .map { str1 -> list2.map { str2 -> str1 + str2 } }
            .flatten()
    }
}
