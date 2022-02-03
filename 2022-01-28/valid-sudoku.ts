function isValidSudoku(board: string[][]): boolean {
    const rowMap = new Map();
    const colMap = new Map();
    const squareMap = new Map();
    for(let i=0;i<9;i++) {
        for(let j=0;j<9;j++) {
            
            let row=i;
            let col=j;
            if(board[row][col] !== '.') {
                if(rowMap.has(board[row][col])) return false;
                rowMap.set(board[row][col], true);
            }
            
            row=j;
            col=i;
            if(board[row][col] !== '.') {
                if(colMap.has(board[row][col])) return false;
                colMap.set(board[row][col], true);
            }
            
            row=Math.floor(i/3)*3 + Math.floor(j/3);
            col=3*Math.floor(i%3) + j%3;
            if(board[row][col] !== '.') {
                if(squareMap.has(board[row][col])) return false;
                squareMap.set(board[row][col], true);
            }
        }
        
        rowMap.clear();
        colMap.clear();
        squareMap.clear();
    }
    return true;
};
