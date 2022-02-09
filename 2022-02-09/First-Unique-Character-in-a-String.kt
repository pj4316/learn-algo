class Solution {
    fun firstUniqChar(s: String): Int {
        val unique = mutableListOf<Pair<Char, Int>>();
        val duplicated = mutableSetOf<Char>()
        s.toCharArray().mapIndexed { index, i ->
            if(duplicated.contains(i)) {
            } else if(unique.any { c -> c.first == i }) {
                unique.removeIf { c -> c.first == i };
                duplicated.add(i)
            } else {
                unique.add(Pair(i, index))
            }
        }

        return if(unique.isNotEmpty()) unique.first().second else -1;
    }
}
