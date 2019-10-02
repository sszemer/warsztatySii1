package racing;

public class Runner extends Thread {

    private Counter counter;

    public Runner(Counter counter){
        this.counter=counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500000; i++) {
            counter.increment();
        }
        System.out.println(Thread.currentThread().getName() + " " + counter.getCount());
    }
}
