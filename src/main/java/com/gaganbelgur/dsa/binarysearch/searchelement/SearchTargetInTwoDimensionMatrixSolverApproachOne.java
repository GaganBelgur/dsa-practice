package main.java.com.gaganbelgur.dsa.binarysearch.searchelement;

public class SearchTargetInTwoDimensionMatrixSolverApproachOne implements SearchTargetInTwoDimensionMatrixSolverInterface {

    @Override
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        if (matrix[0][0] > target || target > matrix[rows - 1][columns - 1]) return false;

        return searchMatrix(matrix, target, rows, columns);
    }

    private boolean searchMatrix(int[][] matrix, int target, int rows, int columns) {
        int rowNumber = -1;
        for (int i = 0; i < rows; i++) {
            if ((matrix[i][0] <= target) && (matrix[i][columns - 1] >= target)) {
                rowNumber = i;
            }
        }

        if (rowNumber == -1) return false;

        int left = 0;
        int right = columns - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (matrix[rowNumber][mid] == target) {
                return true;
            } else if (matrix[rowNumber][mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }
}

