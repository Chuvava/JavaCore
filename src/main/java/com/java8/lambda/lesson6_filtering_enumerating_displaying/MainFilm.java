package com.java8.lesson6_filtering_enumerating_displaying;

import java.util.stream.Stream;

public class MainFilm {

    public static void main(String[] args) {
        Stream<Film> filmStream = Stream.of(new Film("Deadpool 2", 100.0), new Film("Avengers : Infinity War", 75.0));
        filmStream.map(Film::getTitle).forEach(System.out::println);
        filmStream.map(Film::getPrice).forEach(System.out::println);
    }
}
