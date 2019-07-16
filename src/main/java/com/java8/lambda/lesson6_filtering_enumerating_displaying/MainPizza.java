package com.java8.lesson6_filtering_enumerating_displaying;

import java.util.stream.Stream;

public class MainPizza {

    public static void main(String[] args) {

        Stream<Pizza> pizzaStream = Stream.of(new Pizza("Pepperoni", 90));
        pizzaStream.flatMap(pizza -> Stream.of(
              String.format("Pizza: %s, price: $%d", pizza.getTitle(), pizza.getPrice()),
              String.format("(HAPPY HOURS DISCOUNT -50%%)%nPizza: %s, price: $%d", pizza.getTitle(), pizza.getPrice() / 2)
        )).forEach(System.out::println);
    }
}
