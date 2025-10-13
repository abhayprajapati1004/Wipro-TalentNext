package Multithread;

class PriorityTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " is running. Count: " + i);
        }
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        // Create three threads
        Thread minPriorityThread = new Thread(new PriorityTask(), "MinPriorityThread");
        Thread normPriorityThread = new Thread(new PriorityTask(), "NormPriorityThread");
        Thread maxPriorityThread = new Thread(new PriorityTask(), "MaxPriorityThread");

        // Set their priorities
        minPriorityThread.setPriority(Thread.MIN_PRIORITY);   // Priority 1
        normPriorityThread.setPriority(Thread.NORM_PRIORITY); // Priority 5
        maxPriorityThread.setPriority(Thread.MAX_PRIORITY);   // Priority 10

        // Start the threads at the same time
        maxPriorityThread.start();
        normPriorityThread.start();
        minPriorityThread.start();
    }
}