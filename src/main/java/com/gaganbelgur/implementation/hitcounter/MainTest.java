package main.java.com.gaganbelgur.implementation.hitcounter;

public class MainTest {
    public static void main(String[] args) {
        verify(new HitCounterBruteForceSolverImpl());
        verify(new HitCounterBetterApproachSolverImpl());
    }

    private static void verify(HitCounterSolverInterface counterSolverInterface) {
        counterSolverInterface.hit(1);
        counterSolverInterface.hit(2);
        counterSolverInterface.hit(3);
        counterSolverInterface.hit(4);
        int result = counterSolverInterface.getHits(2);

        System.out.println(result);
    }
}
