package com.collections;

import java.util.*;

public class ArrayListCollection {

    public static void main(String[] args) {

//        //1. removeIf(Predicate)
//        ArrayList<Integer> list = new ArrayList();
//        for(int i = 1; i < 100; i++){
//            list.add(i);
//        }
//
//        System.out.println(list.toString());
//        list.removeIf(i -> (i % 10 != 0));
//        System.out.println(list);

        //2. toArray()
        ArrayList<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        String[] daysArray = days.toArray(new String[days.size()]);

//        System.out.println("Массив: " + Arrays.toString(daysArray));

        //2.1 toArray using Stream
        String[] daysArrayStream = days.stream().toArray(String[]::new);
        System.out.println("Массив: " + Arrays.toString(daysArrayStream));

        int monday = Collections.frequency(days, "Monday");
        System.out.println(monday);

        List<String> synchronizedList = Collections.synchronizedList(days);
        System.out.println(synchronizedList.get(3));

        List<String> strings = Collections.unmodifiableList(days);
    }
}
