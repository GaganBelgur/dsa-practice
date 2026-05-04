package main.java.com.gaganbelgur.dsa.binarysearch.maximizesweetness;

public class MaximizeSweetnessTest {
    public static void main(String[] args) {
        MaximizeSweetnessSolverInterface solverInterface = new MaximizeSweetnessOptimalSolverImpl();
        int[] sweetness = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 5;
        int result = solverInterface.maximizeSweetness(sweetness, k);
        System.out.println(result == 6);
    }
}
