package interfacesthreads;

import warsztaty20191002.CountDown;
import warsztaty20191009.RollADice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InterfacesMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> submit = executorService.submit(new RollADice());
        Integer integer = submit.get();
        executorService.shutdown();
    }
}