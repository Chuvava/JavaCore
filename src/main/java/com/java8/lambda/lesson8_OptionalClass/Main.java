package com.java8.lambda.lesson8_OptionalClass;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of();
        Optional<Integer> result = numbers.min(Integer::compareTo);
//        result.ifPresent(System.out::println);
//        System.out.println(result.orElse(0));

        //beginning from Java 9
        //result.ifPresentOrElse(System.out::println, () -> System.out::println ("Stream element not found"));
//        System.out.println(result.orElseGet(() -> new Random().nextInt(100)));
        System.out.println(result.orElseThrow(RuntimeException::new));
    }
}
