package com.java8.lambda.june;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

//        //region Factorial using lambda
//        Factorial f = num -> {
//            int fact = 1;
//            for (int i = num; i >= 1; i--) {
//                fact = fact * i;
//            }
//            return fact;
//        };
//
//        System.out.println("Factorials for the numbers from 1 to 10");
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("Factorial of the %d is %d\n", i, f.getFactorial(i));
//        }
//        //endregion
//
//        //Predicate
//        Predicate<String> isPalindrome = text -> text.equals(new StringBuffer(text).reverse().toString());
//
//        System.out.printf("Is palindrome - %s : %s", "noon", isPalindrome.test("noon"));
//        System.out.printf("\nIs palindrome - %s : %b", "man", isPalindrome.test("man"));
//        System.out.printf("\nIs palindrome - %s : %b", "arara", isPalindrome.test("arara"));
//        System.out.printf("\nIs palindrome - %s : %b", "Arara", isPalindrome.test("Arara"));
//        System.out.printf("\nIs palindrome - %s : %b", "kak", isPalindrome.test("kak"));
//
//        //Function - extract numbers from text
//        Function<String, List<Integer>> getAllNumbers = (text) -> {
//            List<Integer> list = new ArrayList<>();
//            Pattern pattern = Pattern.compile("(\\d+)");
//            Matcher matcher = pattern.matcher(text);
//            while (matcher.find())
//                list.add(Integer.valueOf(matcher.group(0)));
//
//            return list;
//        };
//        String text = "I am 23 years old. Now is 2019 year. I was born on 6 of November. This is 11 month.";
//        System.out.println("\n" + getAllNumbers.apply(text));

        //Streams - Filtering
        List<Integer> nums = new ArrayList<>(100);

        for (int i = 1; i <= 100; i++) {
            nums.add(i);
        }
        System.out.println("Before filtering : ");
        System.out.println(nums);

        System.out.println("After filtering (Prime numbers) : ");
//        nums
//                .stream()
//                .filter(num -> {
//                    int count = 0;
//                    for(int i = num; i >= 1; i--) {
//                        if(num % i == 0){
//                            count++;
//                        }
//                    }
//                    return count == 2;
//                })
//                .sorted((a, b) -> a.compareTo(b))
//                .map(num -> num * 2)
//                .forEach(System.out::println);


        boolean areAllPositive = nums.stream().allMatch(num -> num > 0);
        System.out.println("Are all positive : " + areAllPositive);

        boolean areAnyPositive = nums.stream().anyMatch(num -> num > 0);
        System.out.println("Are any positive : " + areAnyPositive);

        boolean areNonePositive = nums.stream().noneMatch(num -> num > 0);
        System.out.println("Are none positive : " + areNonePositive);

//        long count = nums.stream().filter(num -> num % 3 == 0 && num % 5 == 0).count();
//        System.out.println(count);

        Map<Integer, String> map = new HashMap<>(100);
        Function<Integer, String> fizzBuzz = num -> {
            String keyLocal = "";
            if(num % 3 == 0) keyLocal += "Fizz";
            if(num % 5 == 0) keyLocal += "Buzz";
            return keyLocal;
        };

        for(int i = 1; i <= 100; i++){
            Integer extendedI = Integer.valueOf(i);
            map.put(extendedI, fizzBuzz.apply(extendedI));
        }

        System.out.println("After applying 'FizzBuzz' function : ");
        System.out.println(map);

        MathOperation addition = (a, b) -> a + b;

        NestedClasses nestedClass = new NestedClasses();
        NestedClasses.InnerClass inner = nestedClass.new InnerClass();

//        NestedClasses outer = new NestedClasses();

//        OuterClass.ImNonStaticInterface


    }

    interface MathOperation {
        int operation(int a, int b);
    }
}
