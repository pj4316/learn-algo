class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val magazineMap = mutableMapOf<Char, Int>()
        val ransomNoteMap = mutableMapOf<Char, Int>()
        magazine.toCharArray().forEach { magazineMap[it] = magazineMap.getOrDefault(it, 0) + 1 }
        ransomNote.toCharArray().forEach { ransomNoteMap[it] = ransomNoteMap.getOrDefault(it, 0) + 1 }

        ransomNoteMap.forEach { (key, value) ->
            if ((magazineMap[key] ?: 0) < value) {
                return false;
            }
        }
        return true;
    }
}
