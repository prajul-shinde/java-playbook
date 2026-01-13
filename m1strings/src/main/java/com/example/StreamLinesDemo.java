package com.example;

import java.util.concurrent.atomic.AtomicInteger;

public class StreamLinesDemo {

    public static void main(String[] args) {

        String str = "To whom it may concern \n" +
                "I wish you a good day \n" +
                "Sincerely \n" +
                "Me";

        final AtomicInteger i = new AtomicInteger(1);
        str.lines().forEach(line -> System.out.println(i.incrementAndGet() + " " + line));
    }
}
