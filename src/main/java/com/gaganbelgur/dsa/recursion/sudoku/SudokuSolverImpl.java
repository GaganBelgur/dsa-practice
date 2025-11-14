package main.java.com.gaganbelgur.dsa.recursion.sudoku;

public class SudokuSolverImpl implements SudokuSolverInterface {

    @Override
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        int n = board.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '.') {
                    for (int k = 1; k <= 9; k++) {
                        if (isValidNumber(board, k, i, j)) {
                            board[i][j] = (char) (k + '0');
                            if (solve(board)) return true;
                            else board[i][j] = '.'; // backtrack
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValidNumber(char[][] board, int k, int i, int j) {
        char val = (char) (k + '0');

        // check columns
        for (int row = 0; row < 9; row++) {
            if (board[row][j] == val) return false;
        }

        // check row
        for (int col = 0; col < 9; col++) {
            if (board[i][col] == val) return false;
        }

        // calculate grid
        int startRow = (i / 3) * 3;
        int startCol = (j / 3) * 3;

        for (int row = startRow; row < startRow + 3; row++) {
            for (int col = startCol; col < startCol + 3; col++) {
                if (board[row][col] == val) return false;
            }
        }

        return true;
    }

}
