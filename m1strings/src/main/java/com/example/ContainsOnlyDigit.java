package com.example;

public class ContainsOnlyDigit {

    private static final String ONLY_DIGITS = "123456789";
    private static final String NOT_ONLY_DIGITS = "123456789A";

    public static void main(String[] args) {

        System.out.println("Character.isDigit() solution");
        boolean onlyDigitsV1 = containsOnlyDigitsLoop(ONLY_DIGITS);
        boolean onlyDigitsV2 = containsOnlyDigitsLoop(NOT_ONLY_DIGITS);
        System.out.println("Contains only digits: " + onlyDigitsV1);
        System.out.println("Contains only digits: " + onlyDigitsV1);

        System.out.println();
        System.out.println("Java 8, functional-style solution:");

        boolean onlyDigitsV31 = containsOnlyDigitsFunctional(ONLY_DIGITS);
        boolean onlyDigitsV32 = containsOnlyDigitsFunctional(NOT_ONLY_DIGITS);

        System.out.println("Contains only digits: " + onlyDigitsV31);
        System.out.println("Contains only digits: " + onlyDigitsV32);


        System.out.println();
        System.out.println("String.matches() solution:");


        boolean onlyDigitsV21 = containsOnlyDigitsRegex(ONLY_DIGITS);
        boolean onlyDigitsV22 = containsOnlyDigitsRegex(NOT_ONLY_DIGITS);


        System.out.println("Contains only digits: " + onlyDigitsV21);
        System.out.println("Contains only digits: " + onlyDigitsV22);
    }

    private static boolean containsOnlyDigitsRegex(String str) {

        return str.matches("[0-9]+");
    }

    private static boolean containsOnlyDigitsFunctional(String str) {

        return str.chars().allMatch(Character::isDigit);
    }

    private static boolean containsOnlyDigitsLoop(String str) {

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
