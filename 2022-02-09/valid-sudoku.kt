class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rowSet = mutableSetOf<Char>()
        val colSet = mutableSetOf<Char>()
        val squareSet = mutableSetOf<Char>()
        for (i in 0..8) {
            for (j in 0..8) {
                val row = board[j][i]
                if (row != '.') {
                    if (rowSet.contains(row)) {
                        return false;
                    } else {
                        rowSet.add(row)
                    }
                }

                val col = board[i][j]
                if (col != '.') {
                    if (colSet.contains(col)) {
                        return false;
                    } else {
                        colSet.add(col);
                    }
                }

                val square = board[i / 3 * 3 + j / 3][i % 3 * 3 + j % 3]
                if (square != '.') {
                    if (squareSet.contains(square)) {
                        return false;
                    } else {
                        squareSet.add(square)
                    }
                }
            }
            rowSet.clear();
            colSet.clear();
            squareSet.clear();
        }

        return true;
    }
}
