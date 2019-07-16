package com.java8.lesson3_referencesOnMethodsAndConstructors;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

//        Consumer<String> printer = System.out::println;
//        printer.accept("ulia-lia");
//
//        Consumer<String> printer2 = Main::println;
//        printer2.accept("ulia-lia from that Class");

        Database database = User::new;
        User user = database.create("Pelikan", "12345678");
        System.out.println(user.getName());
        System.out.println(user.getPassword());

        System.out.println(getOperation('+').getResult(16, 8));
        System.out.println(getOperation('-').getResult(16, 8));
        System.out.println(getOperation('*').getResult(16, 8));
        System.out.println(getOperation('/').getResult(16, 8));
    }

    private static void println(String s){
        System.out.println(s);
    }

    private static Operation getOperation(char symbol){
        switch(symbol) {
            case '*':
                return (v1, v2) -> v1 * v2;
            case '+':
                return (v1, v2) -> v1 + v2;
            case '/':
                return (v1, v2) -> v1 / v2;
            case '-':
                return (v1, v2) -> v1 - v2;
                default:
                    return (v1, v2) -> 0;
        }
    }
}
