package main.java.com.gaganbelgur.dsa.binarysearch.largeintegerindex;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        LargeIntegerIndexSolverInterface solverInterface = new LargeIntegerIndexSolverImpl();
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(10);
        list.add(7);
        list.add(7);
        list.add(7);
        ArrayReader arrayReader = new ArrayReader(list);
        int result = solverInterface.getIndex(arrayReader);
        assert result == 3;
        System.out.println(result);
    }
}
