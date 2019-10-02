package warsztaty20191002;

public class CountDown extends Thread   {

    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("Start " + threadName);
        for (int i = 10; i > 0; i--) {
            System.out.println(i + " " + threadName);
            waitASecond();
            Thread.yield();
        }
        System.out.println("Stop " + threadName);
    }

    public void waitASecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
