package com.interviewTasks.naveen;

public class _1_ReverseString {

    public static void main(String[] args) {

        //Reverse a String
        //diff bw String and StringBuffer
        //do we have reverse function in String?

        String s = "Selenium";

//        //MY WAY
//        char[] sArray = s.toCharArray();
//        for(int i = sArray.length - 1; i >=0; i--){
//            System.out.print(sArray[i]);
//        }

//        //naveen - 1.
//        int len = s.length();
//        String rev = "";
//        for(int i = len - 1; i >= 0; i--){
//            rev += s.charAt(i);
//        }
//        System.out.println(rev);

        //2. using StringBuffer class:
        StringBuffer sf = new StringBuffer(s);
        sf.reverse();
        System.out.println(sf);
    }
}
