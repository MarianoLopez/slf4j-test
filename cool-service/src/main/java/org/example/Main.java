package org.example;

public class Main {
    private static CustomLogger logger = new CustomLogger(Main.class);

    public static void main(String[] args) {
        logger.debug("Hello world!");
    }
}
