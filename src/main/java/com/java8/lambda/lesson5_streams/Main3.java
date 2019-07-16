package com.java8.lesson5_streams;

import java.util.ArrayList;
import java.util.Collections;

public class Main3 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, "Tom", "Jeff", "Edward");
        names.stream().filter(name -> name.length() >= 4).forEach(System.out::println);
    }
}
