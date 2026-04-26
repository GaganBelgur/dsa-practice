package main.java.com.gaganbelgur.dsa.binarysearch.fixedpoint;

public class FixedPointSolverImpl implements FixedPointSolverInterface {
    @Override
    public int fixedPoint(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == mid) {
                result = mid;
                high = mid - 1;
            }
            if (arr[mid] < mid) low = mid + 1;
            else high = mid - 1;
        }

        return result;
    }
}
