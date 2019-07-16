package com.interviewTasks.naveen;

public class _2_RemoveJunk {

    public static void main(String[] args) {

        String s = "会意字會意字 latin string 01234567890";

        //Regular Expression: [^a-zA-Z0-9]
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
    }
}
