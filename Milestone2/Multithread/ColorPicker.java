package Multithread;

import java.util.Random;

public class ColorPicker implements Runnable {
    
    @Override
    public void run() {
        String[] colors = {"white", "blue", "black", "green", "red", "yellow"};
        Random random = new Random();

        while (true) {
            int randomIndex = random.nextInt(colors.length);
            String randomColor = colors[randomIndex];
            
            System.out.println(randomColor);

            if (randomColor.equals("red")) {
                System.out.println("Red color found. Stopping the display.");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
