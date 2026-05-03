package main.java.com.gaganbelgur.implementation.hitcounter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HitCounterBruteForceSolverImpl implements HitCounterSolverInterface {

    private final Map<Integer,Integer> counterMap;

    public HitCounterBruteForceSolverImpl() {
        counterMap = new ConcurrentHashMap<>();
    }

    @Override
    public void hit(int timestamp) {
        counterMap.merge(timestamp, 1, Integer::sum);
    }

    @Override
    public int getHits(int timestamp) {
        int start = timestamp - 300 + 1;
        int result = 0;
        for(int i=start; i<=timestamp; i++){
            if(counterMap.containsKey(i)) result+=counterMap.get(i);
        }

        return result;
    }
}
