package com.interviewTasks.naveen.naveen2;

public class _1_ReverseString {

    public static void main(String[] args) {

        String word = "Abrakadabra";

        //1. using for loop and charAt
        String reversed = "";
        for(int i = word.length() - 1; i >=0; i--){
            reversed += word.charAt(i);
        }
        System.out.println(reversed);

        //2. StringBuffer
        StringBuilder builder = new StringBuilder(word);
        String reversed2 = builder.reverse().toString();
        System.out.println(reversed2);
    }
}
