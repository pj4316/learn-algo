// https://programmers.co.kr/learn/courses/30/lessons/92334

class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val answer = IntArray(id_list.size) { 0 }

        val reporterMap = mutableMapOf<String, Set<String>>()
        val reporteeMap = mutableMapOf<String, Set<String>>()
        report.forEach {
            val ids = it.split(" ");

            val reporters = mutableSetOf<String>()
            if(reporterMap.contains(ids[0])) reporters.addAll(reporterMap.getOrDefault(ids[0], emptySet()))
            reporters.add(ids[1])

            reporterMap[ids[0]] = reporters

            val reportees = mutableSetOf<String>()
            if(reporteeMap.contains(ids[1])) reportees.addAll(reporteeMap.getOrDefault(ids[1], emptySet()))
            reportees.add(ids[0])

            reporteeMap[ids[1]] = reportees
        }

        for(i in id_list.indices) {
            answer[i] = reporterMap
                .getOrDefault(id_list[i], emptySet()).count { reporteeMap.getOrDefault(it, emptySet()).size >= k };
        }

        return answer
    }
}
