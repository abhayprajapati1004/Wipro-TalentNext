package Multithread;

class NumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                try {
                    System.out.println("Thread is sleeping for 5 seconds...");
                    Thread.sleep(5000); // 5000 milliseconds = 5 seconds
                } catch (InterruptedException e) {
                    System.err.println("Thread was interrupted.");
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

public class DelayedNumberPrinter {
    public static void main(String[] args) {
        NumberPrinter task = new NumberPrinter();
        Thread thread = new Thread(task);
        thread.start();
    }
}