package com.interviewTasks.naveen;

public class _10_Factorial_RecursiveAndNonRecursive {

    public static void main(String[] args) {

        System.out.println("Factorial of 3 is : " + fact(3));
        System.out.println("Factorial of 5 is : " + fact(5));
        System.out.println("Factorial of 6 is : " + fact(6));
        System.out.println("Factorial of 1 is : " + fact(1));
        System.out.println("Factorial of 0 is : " + fact(0));
//        System.out.println("Factorial of -3 is : " + fact(-3));
//        System.out.println("Factorial of -2 is : " + fact(-2));
    }

    //1. without recursive -- use for loop
    public static int factorial(int num){

        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact *= i;
        }
        return fact;
    }

    //2. with recursive
    public static int fact(int num){
        if(num == 0)
            return 1;
        else
            return num * fact(num - 1);
    }
}
