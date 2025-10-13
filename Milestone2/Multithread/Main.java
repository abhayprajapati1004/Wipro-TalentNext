package Multithread;

public class Main {
    public static void main(String[] args) {
        ColorPicker colorTask = new ColorPicker();
        Thread colorThread = new Thread(colorTask);
        colorThread.start();
    }
}
