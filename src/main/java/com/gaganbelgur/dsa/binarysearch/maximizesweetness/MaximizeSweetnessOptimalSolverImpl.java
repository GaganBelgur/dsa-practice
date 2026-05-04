package main.java.com.gaganbelgur.dsa.binarysearch.maximizesweetness;

public class MaximizeSweetnessOptimalSolverImpl implements MaximizeSweetnessSolverInterface {
    @Override
    public int maximizeSweetness(int[] sweetness, int k) {
        int result = 0;
        for (int sweet : sweetness) {
            result += sweet;
        }

        int left = 1;
        int right = result;

        while(left < right) {
            int mid = left + (right - left + 1) / 2;
            int sum = 0;
            int count = 0;

            for(int sweet: sweetness) {
                sum += sweet;

                if (sum >= mid) {
                    sum = 0;
                    count += 1;
                }
            }

            if(count >= k + 1) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
