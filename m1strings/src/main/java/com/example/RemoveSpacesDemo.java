package com.example;

public class RemoveSpacesDemo {

    public static void main(String[] args) {

        /*
         * trim: ascii
         * strip: unicode (there are so many uni-code whitespace characters than ascii)
         * changing trim itself would have break code so new method were introduces
         * strip is more preferred
         * */
        System.out.println("hello   ".trim() + "   there".trim());
        System.out.println("hello   ".strip() + "   there".strip());

        char space = '\u2002';
        System.out.println("\\u2002 is whitespace: " + Character.isWhitespace(space));
        //trim will not remove it but strip will
        System.out.println("hello\u2002".trim() + "\u2002there".trim());
        System.out.println("hello\u2002".strip() + "\u2002there".strip());
    }
}
