package com.example;

import java.util.function.IntPredicate;

public class ContainsOnlySpecificCharDemo {

    private static final String ONLY_DIGITS = "123";
    private static final String NOT_ONLY_DIGITS = "123A";
    private static final String ONLY_LETTERS = "ABC";
    private static final String NOT_ONLY_LETTERS = "ABC1";

    public static void main(String[] args) {

        IntPredicate isDigit = Character::isDigit;
        IntPredicate isCharacter = Character::isLetter;
        IntPredicate isLetterOrDigit = Character::isLetterOrDigit;

        System.out.println(containsOnly(ONLY_LETTERS, isCharacter));
        System.out.println(containsOnly(ONLY_DIGITS, isDigit));
        System.out.println(containsOnly(NOT_ONLY_LETTERS, isLetterOrDigit));

    }

    private static boolean containsOnly(String str, IntPredicate predicate) {
        return str.chars().allMatch(predicate);
    }

    private static boolean containsOnly(String str, String regex) {
        return str.matches(regex);
    }
}
