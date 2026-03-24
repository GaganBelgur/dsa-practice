package main.java.com.gaganbelgur.dsa.arrays.pascaltriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleSolverImpl implements PascalTriangleSolverInterface {
    @Override
    public List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> result = new ArrayList<>();

        for(int rowNumber = 1; rowNumber <= n; rowNumber++) {
            result.add(generateRow(rowNumber));
        }
        return result;
    }

    private List<Integer> generateRow(int rowNumber) {
        List<Integer> result = new ArrayList<>();
        int ans = 1;

        //add 1 to first column because every row starts with 1
        result.add(1);

        for (int col = 1; col < rowNumber; col++) {
            ans *= (rowNumber - col);
            ans /= col;
            result.add(ans);
        }

        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        PascalTriangleSolverInterface solver = new PascalTriangleSolverImpl();
        solver.pascalTriangle(5);
    }
}
