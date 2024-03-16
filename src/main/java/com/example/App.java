package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hiiiiiii, Docker!");

        // Add a loop to keep the application running
        while (true) {
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
