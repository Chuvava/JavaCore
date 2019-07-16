package com.java8.lamba.lesson2_functionalinterfaces;

import java.util.Scanner;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        Operation<Integer> addition = (v1, v2) -> v1 + v2;
        System.out.println(addition.getResult(2, 8));
        Operation<String> concatenation = (v1, v2) -> v1 + " " + v2;
        System.out.println(concatenation.getResult("some", "text"));

        Predicate<Integer> isZero = value -> value == 0;
        System.out.println(isZero.test(0));
        System.out.println(isZero.test(7));

        Consumer<String> printer = string -> System.out.println(string);
        printer.accept("Some text here without additional operations");

        Function<Integer, Double> converter = value -> Double.valueOf(value);
        System.out.println(converter.apply(48));

//        Supplier<String> text = () -> {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter text : ");
//            return scanner.nextLine();
//        };
//
//        System.out.println(text.get());

        UnaryOperator<Double> sqrt = value -> Math.sqrt(value);
        System.out.println(sqrt.apply(8.0));

        BinaryOperator<Double> pow = (v1, v2) -> Math.pow(v1, v2);
        System.out.println(pow.apply(9.0, 2.0));
    }
}
