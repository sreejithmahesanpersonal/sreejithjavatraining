package com.sreejithjava.ClassDemo;

public class ThreadSynchronozationDemo {
    public static void main(String[] args) {
        // Creating a shared resource
        SharedResource resource = new SharedResource();

        // Creating threads that access the shared resource
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.increment();
                System.out.println("Thread 1 incremented value to: " + resource.getValue());
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                resource.increment();
                System.out.println("Thread 2 incremented value to: " + resource.getValue());
            }
        });

        // Starting the threads
        thread1.start();
        thread2.start();

        // Waiting for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        // Displaying the final value of the shared resource
        System.out.println("Final value: " + resource.getValue());
    }

    // Shared resource class
    static class SharedResource {
        private int value = 0;

        // Synchronized method to increment the value
        public synchronized void increment() {
            value++;
            System.out.println("Value incremented to: " + value);
            try {
                Thread.sleep(100); // Simulating some processing time
            } catch (InterruptedException e) {
                System.out.println("Increment interrupted: " + e.getMessage());
            }

        }

        public synchronized int getValue() {
            return value;
        }
    }
}
