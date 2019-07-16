package com.interviewTasks.others;

public class _2_AllPrimeNumbersBetween1and100 {

    public static void main(String[] args) {

        int i = 0;
        int num = 0;
        String primeNumbers = "";


        for (i = 1; i <= 100; i++) {
//            int counter = 0;
//            for(num = i; num >= 1; num--){
//                if(i % num == 0) {
//                    counter = counter + 1;
//                }
//            }
//            if(counter == 2){
//                primeNumbers = primeNumbers + i + " ";
//            }
            if(isPrimeNumber(i)){
                primeNumbers = primeNumbers + i + " ";
            }

        }

        System.out.println("Prime numbers from 1 to 100 are : ");
        System.out.println(primeNumbers);

        System.out.println(isPrimeNumber(19));
    }

    public static boolean isPrimeNumber(int number){

        int counter = 0;
        for(int i = number; i >= 1; i--){
            if(number % i == 0){
                counter++;
            }
        }

        return counter <= 2;
    }
}
