package main.java.com.gaganbelgur.implementation.hitcounter;

import java.util.LinkedList;
import java.util.Queue;

public class HitCounterBetterApproachSolverImpl implements HitCounterSolverInterface {

    private final Queue<Integer> hits;

    public HitCounterBetterApproachSolverImpl() {
        hits = new LinkedList<>();
    }

    public void hit(int timestamp) {
        hits.add(timestamp);
    }

    public int getHits(int timestamp) {
        while (!hits.isEmpty() && timestamp - hits.peek() >= 300) {
            hits.poll();
        }

        return hits.size();
    }
}
