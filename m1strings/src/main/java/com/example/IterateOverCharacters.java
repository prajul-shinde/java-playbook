package com.example;

public class IterateOverCharacters {

    public static void main(String[] args) {

        String str = "some string";  //it's not array of characters its object

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //do things with char
        }

        for (char c : str.toCharArray()) {
            System.out.println(c);
        }

        System.out.println("Specific char to uppercase: ");
        System.out.println(charToUpperCase(str, 's'));
        System.out.println(charToUpperCase(str, 'g'));
    }

    private static String charToUpperCase(String str, char charToUpper) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            char charToAppend = c == charToUpper ? Character.toUpperCase(c) : c;
            sb.append(charToAppend);
        }
        return sb.toString();
    }
}
