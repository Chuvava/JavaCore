package com.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String someText = "I am 23 years old. Now is 2019 year. I was born on 6 of November. This is 11 month.";

        Pattern pattern = Pattern.compile("[a-z]+");

        Matcher matcher1 = pattern.matcher(someText);
        System.out.println(matcher1.find());


    }
}
