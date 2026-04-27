package main.java.com.gaganbelgur.dsa.binarysearch.cuttingribbons;

public class CuttingRibbonsBruteApproachSolverImpl implements CuttingRibbonsSolverInterface {

    @Override
    public int maxLength(int[] ribbons, int k) {
        int maxValue = 0;
        int ans = 0;

        for(int ribbon: ribbons) {
            maxValue = Math.max(maxValue, ribbon);
        }

        for(int i=1; i<maxValue; i++) {
            int count = 0;

            for(int r: ribbons) {
                count += r/i;

                System.out.println("Ribbon = " + r + " When length = " + i + "Count = " + count);
                if(count >= k) break;
            }

            System.out.println();
            if(count >= k) ans = i;
        }

        return ans;
    }
}
