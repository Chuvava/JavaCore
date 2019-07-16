package com.interviewTasks.naveen;

public class _8_SwapTwoIntsWithoutThird {

    public static void main(String[] args) {

        int x = 5; //0101
        int y = 10; //1010

//        //my solution
//        x = x + y; //x = 15, y = 10
//        y = x - y; //x = 15 y = 5
//        x = x - y; //x = 10, y = 5

        //naveen
        //1. with using third var : temp
        //2. without using third var : using + operator - as my version
//        //3. using * operator
//        x = x * y; //x = 50, y = 10
//        y = x / y; //x = 50, y = 5
//        x = x / y; //x = 10, y = 5

        //4. using XOR: ^
        x = x ^ y; //15 --> 1111 (result of: 0101 or 1010)
        y = x ^ y; //(result of: 1111 or 1010) = 0101
        x = x ^ y; //(result of: 1111 or 0101) = 1010


        System.out.println("Swapped X : " + x);
        System.out.println("Swapped Y : " + y);



    }
}
