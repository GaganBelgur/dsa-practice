package main.java.com.gaganbelgur.dsa.binarysearch.cuttingribbons;

public class MainClass {

    public static void main(String[] args) {
        CuttingRibbonsSolverInterface solver = new CuttingRibbonsBruteApproachSolverImpl();

        int[] ribbons = {9, 7, 5};
        int k = 4;
        findMaxLengthCuttingRibbons(new CuttingRibbonsBruteApproachSolverImpl(), ribbons, k);
        findMaxLengthCuttingRibbons(new CuttingRibbonsBestApproachSolverImpl(), ribbons, k);
    }

    private static void findMaxLengthCuttingRibbons(CuttingRibbonsSolverInterface solver, int[] ribbons, int k) {
        int result = solver.maxLength(ribbons, k);
        System.out.println(result);
    }
}
