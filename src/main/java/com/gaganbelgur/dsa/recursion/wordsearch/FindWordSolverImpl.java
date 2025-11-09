package main.java.com.gaganbelgur.dsa.recursion.wordsearch;

public class FindWordSolverImpl implements FindWordSolverInterface {

    @Override
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (findWord(0, board, word, i, j)) return true;
                }
            }
        }
        return false;
    }

    private boolean findWord(int index, char[][] board, String word, int i, int j) {
        if(index == word.length()) return true;
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length) return false;
        if(board[i][j] == ' ' || board[i][j] != word.charAt(index)) return false;

        char temp = board[i][j];
        board[i][j] = ' ';

        boolean left = findWord(index + 1, board, word, i, j - 1);

        boolean top = findWord(index + 1, board, word, i - 1, j);

        boolean right = findWord(index + 1, board, word, i, j + 1);

        boolean down = findWord(index + 1, board, word, i + 1, j);

        board[i][j] = temp;
        return left || top || right || down;
    }

}
