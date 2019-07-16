package com.java8.lambda.lesson7_mixingOperations;

import java.util.Optional;
import java.util.stream.Stream;

public class MainReduce {

    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
        //1
//        Optional<Integer> result = numbers.reduce((v1, v2) -> v1 + v2);
//        System.out.println(result.get());
        //2
//        int result = numbers.reduce(10, (v1, v2) -> v1 + v2);
//        System.out.println(result);
        //3
        int result = numbers.reduce(0, (v1, v2) -> {
            if(v1 < 5){
                return v1 + v2;
            } else{
                return v1;
            }
        },(v1, v2) -> v1 + v2);

        System.out.println(result);

    }
}
