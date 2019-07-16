package com.java8.lesson6_filtering_enumerating_displaying;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<String> passwords = Stream.of("3sa215", "4mxj2o", "9okfgy6");
        passwords.filter(password -> password.length() == 7).forEach(System.out::println);

        Stream<String> stream = Stream.of("V-1", "V-2", "V-3", "V-4", "V-5");
//        stream.skip(2).forEach(System.out::println);
        stream.limit(2).forEach(System.out::println);
    }
}
