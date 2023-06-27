package org.example.zaur;

import org.w3c.dom.css.Counter;

public class AboutThreads {


    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread mySecondThread = new Thread(new MySecondThread());

        myThread.start();
        mySecondThread.start();

        myThread.join();
        mySecondThread.join();

        System.out.println(MyCounter.count);
    }
}
class MyCounter{
     static int count;
}

 class MyThread extends Thread {
     public void increment() {
         MyCounter.count++;
     }
    public void run() {
        for (int i = 0; i<=100; i++){
            increment();
        }
    }
}

class MySecondThread implements Runnable {
    public void increment() {
        MyCounter.count++;
    }

    @Override
    public void run() {
        for (int i = 0; i<=100; i++){
            increment();
        }
    }
}





