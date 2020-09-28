package org.example;

public class Main {
    private static CustomLogger customLogger = new CustomLogger(Main.class);

    public static void main(String[] args) {
        customLogger.debug("Hello world!");
    }
}
