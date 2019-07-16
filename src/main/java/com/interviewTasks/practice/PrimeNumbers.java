package com.interviewTasks.practice;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        //1. Find the given number is a prime number or not
        System.out.println("Is 17 a prime number : " + isPrimeNumber(17));
        System.out.println("Is 8 a prime number : " + isPrimeNumber(8));
        System.out.println("Is 3 a prime number : " + isPrimeNumber(3));
        System.out.println("Is 15 a prime number : " + isPrimeNumber(15));
        System.out.println("Is 26 a prime number : " + isPrimeNumber(26));

        //2. Display all the prime numbers between 1 and 100
        System.out.println("The prime numbers from 1 to 100 are: ");
        for(int i = 1; i <= 100; i++){
            if(isPrimeNumber(i)){
                System.out.print(i + ", ");
            }
        }

        //3. How to display all the prime numbers between 1 and n
        System.out.println("Write the number till which you'd like to see all the prime numbers : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(String.format("The prime numbers from 1 to %d are: ", n));
        for(int i = 1; i <= n; i++){
            if(isPrimeNumber(i)){
                System.out.print(i + ", ");
            }
        }

    }

    public static boolean isPrimeNumber(int number) {

        int counter = 0;

        for (int i = number; i >= 1; i--) {
            if(number % i == 0){
                counter++;
            }
        }

        return counter == 2;
    }
}
