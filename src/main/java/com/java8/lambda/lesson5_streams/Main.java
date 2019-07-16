package com.java8.lesson5_streams;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<String> objectStream = Arrays.stream(new String[]{"a", "b", "c"});
        objectStream.forEach(System.out::println);

        IntStream intStream = Arrays.stream(new int[]{1, 1, 1});
        intStream.forEach(System.out::println);

        LongStream longStream = Arrays.stream(new long[]{2, 2, 2});
        longStream.forEach(System.out::println);

        DoubleStream doubleStream = Arrays.stream(new double[]{3.0, 3.0, 3.0});
        doubleStream.forEach(System.out::println);
    }
}
