class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false;

        val sMap = mutableMapOf<Char, Int>()
        val tMap = mutableMapOf<Char, Int>()

        for(i in s.indices) {
            val sc = s[i]
            val tc = t[i]
            sMap[sc] = sMap.getOrDefault(sc, 0) + 1
            tMap[tc] = tMap.getOrDefault(tc, 0) + 1
        }

        sMap.forEach { (key, value) ->
            if(tMap[key] != value) return false
        }

        return true;
    }
}
