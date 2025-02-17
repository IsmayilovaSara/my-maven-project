package com.mycompany.myapp;

/**
 * The App class is the entry point of the application.
 * It contains the main method which prints a greeting message
 * to the console, and a method to return a greeting string.
 */

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Maven!");
    }

    public String getGreeting() {
        return "Hello, Maven!";
    }
}

