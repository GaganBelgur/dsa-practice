package main.java.com.gaganbelgur.dsa.binarysearch.searchelement;

public class SearchTargetInTwoDimensionMatrixSolverApproachTwo implements SearchTargetInTwoDimensionMatrixSolverInterface {

    @Override
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        if (matrix[0][0] > target || target > matrix[rows - 1][columns - 1]) return false;

        return searchMatrix(matrix, target, rows, columns);
    }

    private boolean searchMatrix(int[][] matrix, int target, int rows, int columns) {
        int left = 0;
        int right = rows * columns - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / columns;
            int col = mid % columns;
            int midValue = matrix[row][col];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}

