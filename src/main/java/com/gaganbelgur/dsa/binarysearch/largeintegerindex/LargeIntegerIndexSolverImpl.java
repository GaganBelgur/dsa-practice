package main.java.com.gaganbelgur.dsa.binarysearch.largeintegerindex;

public class LargeIntegerIndexSolverImpl implements LargeIntegerIndexSolverInterface {

    @Override
    public int getIndex(ArrayReader reader) {
        int left = 0;
        int right = reader.length() - 1;

        while (left < right) {
            int len = right - left + 1;
            int mid = left + (right - left) / 2;

            if (len % 2 == 0) {
                // even length → equal halves
                int result = reader.compareSub(left, mid, mid + 1, right);

                if (result == 1) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            } else {
                // odd length → skip middle
                int result = reader.compareSub(left, mid - 1, mid + 1, right);

                if (result == 1) {
                    right = mid - 1;
                } else if (result == -1) {
                    left = mid + 1;
                } else {
                    return mid; // middle is the answer
                }
            }
        }

        return left;
    }
}
