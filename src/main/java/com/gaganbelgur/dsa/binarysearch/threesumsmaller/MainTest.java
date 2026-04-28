package main.java.com.gaganbelgur.dsa.binarysearch.threesumsmaller;

public class MainTest {
    public static void main(String[] args) {
        ThreeSumSmallerSolverInterface solver = new ThreeSumSmallerBruteForceSolver();
        int[] nums = {-2, 0, 1, 3};
        int target = 2;
        int result = solver.threeSumSmaller(nums, target);
        System.out.println(result);
    }
}
