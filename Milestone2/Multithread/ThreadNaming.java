package Multithread;

public class ThreadNaming {
    public static void main(String[] args) {
        Thread thread1 = new Thread("Scooby");
        Thread thread2 = new Thread("Shaggy");

        System.out.println("Thread 1 Name: " + thread1.getName());
        System.out.println("Thread 2 Name: " + thread2.getName());
    }
}