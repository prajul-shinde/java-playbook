package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ProgramDemo {

    static String text = """
            Tokyo, 37000000
            New York, 20_000_000
            Paris, 11.000.000
            """;

    public static void main(String[] args) {

        List<String> populations = new ArrayList<>();
        String[] lines = text.split("\n");
        for (String line : lines) {
            String population = line.split(",")[1];
            String sanitized = population.replaceAll("^\\d", "");
            populations.add(population);
        }
        System.out.println(populations);

        List<String> populations2 = text
                .lines()
                .map(s -> s.split(",")[1])
                .map(s -> s.replaceAll("^\\d", ""))
                .toList();

        System.out.println(populations2);

        Function<String, String> separateByComma = s -> s.split(",")[1];
        Function<String, String> sanitizeString = s -> s.replaceAll("^\\d", "");

        List<String> populations3 = text
                .lines()
                .map(separateByComma.andThen(sanitizeString))
                .toList();
        System.out.println(populations3);

    }
}
