package main.java.com.gaganbelgur.dsa.arrays.spiralmatrix;

import java.util.ArrayList;
import java.util.List;

/*
* Intuition
* top → starting row
* bottom → ending row
* left → starting column
* right → ending column
* And we shrink them after each traversal
*
* Order of Movement (Clockwise)
* Left → Right   (top row)
* Top → Bottom   (right column)
* Right → Left   (bottom row)
* Bottom → Top   (left column)
*/
public class SpiralMatrixSolverImpl implements SpiralMatrixSolverInterface {

    @Override
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix[0].length;
        int n = matrix.length;
        int top = 0;
        int left = 0;
        int bottom = n - 1;
        int right = m - 1;

        List<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {

            // Traverse Top Row (Left → Right)
            for (int i = left; i <= right; ++i) {
                result.add(matrix[top][i]);
            }
            top++;

            // Traverse Right Column (Top → Bottom)
            for (int i = top; i <= bottom; ++i) {
                result.add(matrix[i][right]);
            }
            right--;

            // Traverse Bottom Row (Right → Left)
            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse Left Column (Bottom → Top)
            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
