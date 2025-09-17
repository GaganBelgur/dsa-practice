package main.java.com.gaganbelgur.dsa.arrays.missingrepeatednumbers;

public class FindMissingAndRepeatedNumberSolverOptimizedApproach implements FindMissingAndRepeatedNumberSolverInterface {

    @Override
    public int[] findMissingRepeatingNumbers(int[] nums) {
        long n = nums.length;

        long sumOfNaturalNumbers = (n * (n + 1)) / 2;
        long sumOfArrayNumbers = 0;

        long sumOfSquareOfNaturalNumbers = (n * (n + 1) * ((2 * n) + 1)) / 6;
        long sumOfSquareOfArrayNumbers = 0;

        for (long num : nums) {
            sumOfArrayNumbers += num;
            sumOfSquareOfArrayNumbers += (long) (num * num);
        }

        long diff = sumOfArrayNumbers - sumOfNaturalNumbers;
        long sqDiff = sumOfSquareOfArrayNumbers - sumOfSquareOfNaturalNumbers;
        long sum = sqDiff / diff;

        int repeated = (int) ((diff + sum) / 2);
        int missing = (int) (repeated - diff);

        return new int[] {repeated, missing};
    }
}
