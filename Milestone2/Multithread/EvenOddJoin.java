package Multithread;

class EvenPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 20; i += 2) {
            System.out.println("Odd:  " + i);
        }
    }
}

public class EvenOddJoin {
    public static void main(String[] args) {
        // Create runnables for the tasks
        EvenPrinter evenTask = new EvenPrinter();
        OddPrinter oddTask = new OddPrinter();

        // Create threads for the runnables
        Thread evenThread = new Thread(evenTask);
        Thread oddThread = new Thread(oddTask);

        // Start the even number thread first
        evenThread.start();

        try {
            // The main thread waits here until evenThread finishes its execution
            evenThread.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted while waiting for evenThread.");
            Thread.currentThread().interrupt();
        }

        // After evenThread has completed, start the odd number thread
        oddThread.start();
    }
}
