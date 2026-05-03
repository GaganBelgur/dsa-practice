package main.java.com.gaganbelgur.implementation.hitcounter;

public class MainTest {
    public static void main(String[] args) {
        HitCounterSolverInterface counterSolverInterface = new HitCounterBruteForceSolverImpl();
        counterSolverInterface.hit(1);
        counterSolverInterface.hit(2);
        counterSolverInterface.hit(3);

        System.out.println(counterSolverInterface.getHits(3));
    }
}
