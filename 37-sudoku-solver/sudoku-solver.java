class Solution {

    public boolean isSafe(char[][] board, int row, int col, char digit) {

        // Check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == digit) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == digit) {
                return false;
            }
        }

        // Check 3 x 3 box
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean solve(char[][] board, int row, int col) {

        // Sudoku completely solved
        if (row == 9) {
            return true;
        }

        // Calculate next cell
        int nextRow = row;
        int nextCol = col + 1;

        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // Already filled cell
        if (board[row][col] != '.') {
            return solve(board, nextRow, nextCol);
        }

        // Try digits 1 to 9
        for (char digit = '1'; digit <= '9'; digit++) {

            if (isSafe(board, row, col, digit)) {

                // Place digit
                board[row][col] = digit;

                // Recursively solve next cell
                if (solve(board, nextRow, nextCol)) {
                    return true;
                }

                // Backtracking
                board[row][col] = '.';
            }
        }

        return false;
    }

    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }
}