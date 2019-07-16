package com.java8.lesson6_filtering_enumerating_displaying;

public class Film {

    private String title;
    private Double price;

    public Film(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }
}
