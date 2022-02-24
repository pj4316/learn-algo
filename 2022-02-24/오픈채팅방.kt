// https://programmers.co.kr/learn/courses/30/lessons/42888

class Solution {
        fun solution(record: Array<String>): Array<String> {
        val usernameMap = mutableMapOf<String, String>()

        record
            .filter{ !it.startsWith("Leave") }
            .forEachIndexed { _, s ->
                val commands = s.split(" ")
                usernameMap[commands[1]] = commands[2]
            }

        return record
            .filter { !it.startsWith("Change") }
            .map {
                val commands = it.split(" ")
                if (it.startsWith("Enter")) "${usernameMap[commands[1]]}님이 들어왔습니다."
                else "${usernameMap[commands[1]]}님이 나갔습니다."
            }
            .toTypedArray()
    }
}
