package com.example;

public class CompareStringsDemo {

    public static void main(String[] args) {
        System.out.println("abc" == "abc");  //true  string pool

        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1==s2);  //false
        System.out.println(s1.equals(s2));//true
        /*
         use defensive coding while doing equals
         eg "mystr".equals(s2);
         this prevents null pointers
         */
    }
}
