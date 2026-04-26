package main.java.com.gaganbelgur.dsa.arrays.smallestcommonelement;

public class SmallestCommonElementBestApproachSolverImpl implements SmallestCommonElementSolverInterface {
    @Override
    public int smallestCommonElement(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[] pointers = new int[rows];

        for (int col = 0; col < cols; col++) {
            int target = mat[0][col];
            boolean found = true;

            for (int row = 0; row < rows; row++) {

                while (pointers[row] < cols && mat[row][pointers[row]] < target) {
                    pointers[row]++;
                }

                if (pointers[row] == cols || mat[row][pointers[row]] != target) {
                    found = false;
                    break;
                }
            }

            if (found) return target;
        }

        return -1;
    }
}
