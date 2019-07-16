package com.collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class SetCollections {

    public static void main(String[] args) {

//        //1. HashSet
//        HashSet<String> countryHashSet = new HashSet<>();
//        countryHashSet.add("Russia");
//        countryHashSet.add("Cot'Di'Vuar");
//        countryHashSet.add("France");
//        countryHashSet.add("Honduras");
//        countryHashSet.add("Cot'Di'Vuar");
//
//        Iterator<String> iterator = countryHashSet.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println("Size HashSet = " + countryHashSet.size());
//
        //2. LinkedHashSet
//        LinkedHashSet<String> ountryHashSet = new LinkedHashSet<>();
//        ountryHashSet.add("Russia");
//        ountryHashSet.add("Cot'Di'Vuar");
//        ountryHashSet.add("France");
//        ountryHashSet.add("Honduras");
//        ountryHashSet.add("Cot'Di'Vuar");
//
//        Iterator<String> iterator2 = ountryHashSet.iterator();
//        while(iterator2.hasNext()){
//            System.out.println(iterator2.next());
//        }
//
//        //3. SortedSet, TreeSet
//        SortedSet<String> countrySet3 = new TreeSet<>();
//        countrySet3.add("Россия");
//        countrySet3.add("Франция");
//        countrySet3.add("Гондурас");
//        countrySet3.add("Кот-Д'Ивуар");
//
//        System.out.println(countrySet3.toString());
//
//        Random rand = new Random(1000);
//        SortedSet<Integer> numbers = new TreeSet<>();
//        for (int i = 0; i < 100; i++) {
//            numbers.add(rand.nextInt(300));
//        }
//        System.out.println(numbers.toString());

        //4. SortedSet Interface
        SortedSet<String> animalSet = new TreeSet();
        animalSet.add("Antilope");
        animalSet.add("Fox");
        animalSet.add("Goat");
        animalSet.add("Dog");
        animalSet.add("Elephant");
        animalSet.add("Bear");
        animalSet.add("Hippo");
        animalSet.add("Cat");

        Iterator iterator1 = animalSet.iterator();

        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println(((TreeSet<String>) animalSet).subSet("Dog", "Hippo").toString());
        System.out.println(((TreeSet<String>) animalSet).tailSet("Dog"));
        System.out.println(((TreeSet<String>) animalSet).headSet("Dog"));
        System.out.println(animalSet.first());
        System.out.println(animalSet.last());


    }
}
