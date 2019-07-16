package com.interviewTasks.naveen;

public class _9_SwapTwoStringWithoutThird {

    public static void main(String[] args) {

        String a = "Hello";
        String b = "World";

////        //my solution
//        a = a + b; //a = HelloWorld b = World
//        b = a.replace(b, ""); //a = HelloWorld b = Hello
//        a = a.replace(b, ""); //a = World b = Hello
//
////        //naveen 1. - using substring
////        a = a + b; //HelloWorld
////        b = a.substring(0, a.length() - b.length()); //Hello
////        a = a.substring(b.length());



        a = a + b;
        b = a.replaceAll(b, "");
        a = a.replaceAll(b, "");


        System.out.println("Swapped a : " + a);
        System.out.println("Swapped b : " + b);
    }
}
