package org.example.zaur;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPools {
    static int resultRun;
    static int resultCall;
    static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        RunImpl runImpl = new RunImpl(5);
        CalImpl calImpl = new CalImpl(6);

        executorService.execute(runImpl);
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("result after Run "+resultRun);

        Future<Integer> future = executorService.submit(calImpl);
        try {
            resultCall = future.get();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }

        System.out.println("result after Call "+resultCall);

        executorService.shutdown();
        System.out.println("Main ends");
    }
}

class RunImpl implements Runnable {
    int f;

    public RunImpl(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("The f is wrong");
            return;
        }
        int res = 1;
        for (int i = 1; i <= f; i++) {
            res *= i;
        }
        ThreadPools.resultRun = res;
    }
}

class CalImpl implements Callable<Integer> {
    int f;

    public CalImpl(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("The f is wrong");
        }
        int res = 1;
        for (int i = 1; i <= f; i++) {
            res *= i;
        }
        return res;
    }
}
