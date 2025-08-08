package day6;

import java.util.Random;

public class colourdisplay implements Runnable {
    // Array of colours
    String colours[] = {"white", "blue", "black", "green", "red", "yellow"};

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int index = random.nextInt(colours.length); // Generate random index
            String colour = colours[index];
            System.out.println("Colour: " + colour);

            if (colour.equals("red")) {
                System.out.println("Red found! Stopping the display.");
                break;
            }

            try {
                Thread.sleep(500); // Just to slow down the output (optional)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Main method to start the thread
    public static void main(String[] args) {
        colourdisplay displayTask = new colourdisplay();
        Thread thread = new Thread(displayTask);
        thread.start();
    }
}
