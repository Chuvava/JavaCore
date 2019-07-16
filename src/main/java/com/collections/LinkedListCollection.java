package com.collections;

import sun.rmi.runtime.Log;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {

    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Barsik");
        linkedList.add("Murzik");
        linkedList.add("Ryzhik");
        Iterator<String> iterator = linkedList.iterator();
        String firstCat = iterator.next(); // обратиться к первому элементу
        System.out.println("First Cat : " + firstCat);
        String secondCat = iterator.next(); // обратиться ко второму элементу
        System.out.println("Second Cat : " + secondCat);

        System.out.println(linkedList.get(2));
    }
}
