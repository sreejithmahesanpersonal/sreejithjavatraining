package com.sreejithjava.ClassDemo;

public class ThreadsDemo   {
    public static void main(String[] args) {
        // Creating a thread using a lambda expression
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread is running: " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
            }
        });

        // Starting the thread
        thread.start();

        // Main thread continues to run
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread is running: " + i);
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted: " + e.getMessage());
            }
        }
    }
}
