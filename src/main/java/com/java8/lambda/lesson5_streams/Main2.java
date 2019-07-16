package com.java8.lesson5_streams;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main2 {

    public static void main(String[] args) {

        Stream<String> objectStream = Stream.of("a", "b", "c");
        objectStream.forEach(System.out::println);

        IntStream intStream = IntStream.of(1, 2, 3);
        intStream.forEach(System.out::println);

        LongStream longStream = LongStream.of(2, 2, 2);
        longStream.forEach(System.out::println);

        DoubleStream doubleStream = DoubleStream.of(3.0, 3.0, 3.0);
        doubleStream.forEach(System.out::println);
    }
}
