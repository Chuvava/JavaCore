package com.java8.lesson4_streamApiIntroduction;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {-2, -1, 0, 1, 2};


        IntStream.of(numbers).filter(value -> value < 0).filter(value -> value != -2).forEach(System.out::println);
    }
}
