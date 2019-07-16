package com.interviewTasks.practice;

public class Palindrome {

    public static void main(String[] args) {

        String pal1 = "racecar";
        String pal2 = "noon";
        String notPal = "chair";

        System.out.printf("Is %s palindrome? Result : %s%n", pal1, isPalindrome(pal1));
        System.out.printf("Is %s palindrome? Result : %s%n", pal2, isPalindrome(pal2));
        System.out.printf("Is %s palindrome? Result : %s%n", notPal, isPalindrome(notPal));
    }

    public static boolean isPalindrome(String word){

        String reversed = new StringBuffer(word).reverse().toString();

//        if(reversed.equals(word)){
//            return true;
//        } else {
//            return false;
//        }

        return reversed.equals(word);
    }

//    public static boolean isPalindrome(String word){
//
//        String reversed = "";
//        for(int i = word.length() - 1; i >= 0; i--){
//            reversed += word.charAt(i);
//        }
//
//        boolean result = reversed.equals(word) ? true : false;
//        return result;
//    }
}
