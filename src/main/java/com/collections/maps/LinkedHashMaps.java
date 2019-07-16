package com.collections.maps;

import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class LinkedHashMaps {

    public static void main(String[] args) {

        LinkedHashMap <Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Vasya");
        linkedHashMap.put(2, "Sasha");
        linkedHashMap.put(3, "Piatro");
        linkedHashMap.put(1, "Grisha");

        System.out.println(linkedHashMap);

    }
}
