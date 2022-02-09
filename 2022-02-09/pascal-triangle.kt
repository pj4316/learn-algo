class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        result.add(listOf(1));
        for (row in 1 until numRows) {
            val prevArr = result[row - 1];
            val newArr = mutableListOf<Int>();

            newArr.add(1);
            prevArr.take(row-1).forEachIndexed { index, _ ->
                newArr.add(prevArr[index] + prevArr[index + 1])
            }
            newArr.add(1);
            
            result.add(newArr);
        }

        return result;
    }
}
