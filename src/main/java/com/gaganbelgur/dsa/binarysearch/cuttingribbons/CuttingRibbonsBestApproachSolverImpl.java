package main.java.com.gaganbelgur.dsa.binarysearch.cuttingribbons;

public class CuttingRibbonsBestApproachSolverImpl implements CuttingRibbonsSolverInterface {

    @Override
    public int maxLength(int[] ribbons, int k) {
        int maxValue = 0;
        int ans = 0;

        for (int ribbon : ribbons) {
            maxValue = Math.max(maxValue, ribbon);
        }

        int low = 1;
        int high = maxValue;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;

            for (int r : ribbons) {
                count += r / mid;
                if (count >= k) break;
            }

            if (count >= k) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
