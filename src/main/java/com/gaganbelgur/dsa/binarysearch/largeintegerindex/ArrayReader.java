package main.java.com.gaganbelgur.dsa.binarysearch.largeintegerindex;

import java.util.List;

public class ArrayReader {
    private final List<Integer> arr;

    public ArrayReader(List<Integer> input) {
        this.arr = input;
    }

    public int length() {
        return arr.size();
    }

    public int compareSub(int l1, int r1, int l2, int r2) {
        if (r1 >= arr.size() || r2 >= arr.size()) return 0;
        int sum1 = arr.subList(l1, r1 + 1).stream().mapToInt(Integer::intValue).sum();
        int sum2 = arr.subList(l2, r2 + 1).stream().mapToInt(Integer::intValue).sum();
        return Integer.compare(sum1, sum2);
    }
}
