package com.java8.lambda.lesson7_mixingOperations;

import java.util.ArrayList;
import java.util.stream.Stream;

public class MainTicket {

    public static void main(String[] args) {
        ArrayList<Ticket> tickets = new ArrayList<>();
        tickets.add(new Ticket("A", 100));
        tickets.add(new Ticket("B", 75));
        tickets.add(new Ticket("C", 50));

        Ticket minimumTicketPrice = tickets.stream().min(Ticket::compare).get();
        System.out.printf("Minimum price of ticket class %s: $%d%n", minimumTicketPrice.getTicketClass(), minimumTicketPrice.getPrice());
        Ticket maximumTicketPrice = tickets.stream().max(Ticket::compare).get();
        System.out.printf("Maximum price of ticket class %s: $%d%n", maximumTicketPrice.getTicketClass(), maximumTicketPrice.getPrice());

    }
}
