// https://programmers.co.kr/learn/courses/30/lessons/81301
class Solution {
    private val numberWords = listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
    fun solution(s: String): Int {

        val sb = StringBuilder();
        val remain = StringBuilder(s);
        while(remain.isNotEmpty()) {
            val num = remain.takeWhile { it.isDigit() };
            val word = numberWords.find { remain.startsWith(it) };
            if(num.isNotEmpty()) {
                sb.append(num);
                remain.delete(0,num.length)
            } else if (word != null) {
                sb.append(numberWords.indexOf(word))
                remain.delete(0, word.length)
            }
        }
        return sb.toString().toInt()
    }
}
