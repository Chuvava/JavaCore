package com.java8.lambda.lesson7_mixingOperations;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<Integer> mixedNumbers = Stream.of(-2, -1, 0, 1, 2);
//        System.out.println(mixedNumbers.allMatch(value -> value > 0));
//        System.out.println(mixedNumbers.anyMatch(value -> value > 0));
        System.out.println(mixedNumbers.noneMatch(value -> value > 0));

        Stream<Integer> positiveNumbers = Stream.of(1, 2);
//        System.out.println(positiveNumbers.allMatch(value -> value > 0));
//        System.out.println(positiveNumbers.anyMatch(value -> value > 0));
        System.out.println(positiveNumbers.noneMatch(value -> value > 0));

        Stream<Integer> negativeNumbers = Stream.of(-2, -1);
//        System.out.println(negativeNumbers.allMatch(value -> value > 0));
//        System.out.println(negativeNumbers.anyMatch(value -> value > 0));
//        System.out.println(negativeNumbers.noneMatch(value -> value > 0));
//        System.out.println(negativeNumbers.anyMatch(value -> !(value > 0)));
        System.out.println(negativeNumbers.count());
    }
}
