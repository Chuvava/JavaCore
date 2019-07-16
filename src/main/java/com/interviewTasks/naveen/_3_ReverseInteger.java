package com.interviewTasks.naveen;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _3_ReverseInteger {

    public static void main(String[] args) {

        int num = 12300;

//        //my solution
//        String reversedNum = "";
//        while (num != 0) {
//            Integer item = num % 10;
//            reversedNum += item.toString();
//            num /= 10;
//        }
//        System.out.println(Integer.valueOf(reversedNum));


//        //Naveen 1. - using algo - it doesn't work with zeros in the end or in the beginning
//        int rev = 0;
//        while(num != 0){
//            rev = rev * 10 + num % 10;
//            num /= 10;
//        }
//        System.out.print(rev);

        //2. using StringBuffer
//        System.out.println(new StringBuffer(String.valueOf(num)).reverse());

//        //Stackoverflow
//        String reverse = new StringBuilder(num + "").reverse().toString();
//        System.out.println(reverse);

//        StringBuilder sb = new StringBuilder(String.valueOf(num));
//        System.out.println(sb.reverse());


        int rev = 0;
        int countOfZeros = 0;
        String reversed = "";
        while(num != 0){
            if(num % 10 == 0){
                countOfZeros++;
            }
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        reversed = String.valueOf(rev);
        for(int i = 0; i < countOfZeros; i++){
           reversed  = "0" + reversed;
        }

        System.out.println(reversed);


    }
}
