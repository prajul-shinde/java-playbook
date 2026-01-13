package com.example;

import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningStrings {

    public static void main(String[] args) {

        String delimiter = ";";
        String[] strings = {"11", "12", null, "13", "14", "15", "16", "17"};

        System.out.println(joinOldWay(delimiter, strings));
        System.out.println(joinSimplest(delimiter, strings));
        System.out.println(joinWithJoiner(delimiter, strings));
        System.out.println(joinWithStream(delimiter, strings));
    }

    private static String joinWithStream(String delimiter, String[] args) {

        return
                Stream.of(args)
                        .filter(arg -> arg!=null)
                        .filter(arg -> !arg.isEmpty())
                        .collect(Collectors.joining(delimiter, "{", "}"));
    }

    private static String joinWithJoiner(String delimiter, String[] args) {
        StringJoiner sj = new StringJoiner(delimiter, "{", "}");
        for (String arg : args) {
            sj.add(arg);
        }
        return sj.toString();
    }

    private static String joinSimplest(String delimiter, String[] args) {
        return "[" + String.join(delimiter, args) + "]";
    }

    private static String joinOldWay(String delimiter, String[] args) {
        StringBuilder sb = new StringBuilder();
        int i;
        for (i = 0; i < args.length - 1; i++) {
            sb.append(args[i]).append(delimiter);
        }
        sb.append(args[i]);
        return sb.toString();
    }
}
