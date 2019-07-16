package com.interviewTasks.practice;

public class MaxOf3Nums {

    public static void main(String[] args) {

        System.out.println(maxOf3Nums(43, 32, 106));
        System.out.println(getAverageOfTwo(8, 13));
    }

    //my solution - is the same as in the app
    public static int maxOf3Nums(int n1, int n2, int n3){
        if(n1 >= n2 && n1 >= n3)
            return n1;
        else if(n2 >= n1 && n2 >= n3)
            return n2;
        else
            return n3;
    }

    public static double getAverageOfTwo(int n1, int n2){
        return (Double.valueOf(n1) + Double.valueOf(n2)) / 2;
    }
}
