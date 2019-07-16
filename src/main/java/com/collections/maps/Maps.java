package com.collections.maps;

import java.util.Map;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {

        Map<String, Person> people = new TreeMap<String, Person>();
        people.put("1240i54", new Person("Tom"));
        people.put("1564i55", new Person("Bill"));
        people.put("4540i56", new Person("Nick"));


        for(Map.Entry<String, Person> item : people.entrySet()){

            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
}

class Person{

    private String name;
    public Person(String name){

        this.name = name;
    }
    String getName(){return name;}
}