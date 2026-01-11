package com.example;

public class TransformStringDemo {

    public static void main(String[] args) {

        //old way
        String lotteryWin = " 100 usd ";
        String result = lotteryWin
                .replaceAll("[a-z]", "")
                .strip();
        String formattedResult = formatNumber(result);
        System.out.println(formattedResult.toUpperCase());

//        new way: achieve result with single chain of methods
        String finalResult = lotteryWin
                .replaceAll("[a-z]", "")
                .strip()
                .transform(TransformStringDemo::formatNumber)
                .toUpperCase();
        
        // using all transform
        String finalTransformed = lotteryWin
                .transform(s -> s.replaceAll("[a-z]", ""))
                .transform(String::strip)
                .transform(TransformStringDemo::formatNumber)
                .transform(String::toUpperCase);
    }

    private static String formatNumber(String num) {
        if (Integer.parseInt(num) < 100) {
            return "Nice! you have won: " + num;
        } else {
            return "Great news! you have won: " + num;
        }
    }
}
