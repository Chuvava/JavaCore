package com.interviewTasks.others;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _1_ExtractNumbersFromText {

    public static void main(String[] args) {

        String someText = "I am 23 years old. Now is 2019 year. I was born on 6 of November. This is 11 month.";

        //1. my way
        String [] ar = someText.split(" ");

        List<Integer> intAr = new ArrayList<>();

        for(String item : ar){
            try {
                intAr.add(Integer.valueOf(item));
            }
            catch(Exception e){

            }
        }

        System.out.println(intAr);

//        //2. using replaceAll and '\\D+' regex
//        someText = someText.replaceAll("\\D+", " ").trim();
////        someText = someText.replaceAll("[^0-9]+", " ").trim();
//        System.out.println(someText);


//        //3. Using Pattern and Matcher
//        Pattern pattern = Pattern.compile("(\\d+)");
//        Matcher matcher1 = pattern.matcher(someText);
//
//        while (matcher1.find()) {
//                System.out.println(matcher1.group(1));
//        }
    }
}
