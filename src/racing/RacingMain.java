package racing;

public class RacingMain {

    private static long aLong;

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        aLong = System.currentTimeMillis();
        Runner runner = new Runner(counter);
        runner.start();
        Runner runner1 = new Runner(counter);
        runner1.start();
        Runner runner2 = new Runner(counter);
        runner2.start();
        runner.join();
        runner1.join();
        runner2.join();
        System.out.println("Stop " + counter.getCount());
        System.out.println(System.currentTimeMillis() -aLong);
    }
}
