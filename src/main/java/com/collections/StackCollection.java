package com.collections;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

import java.util.Stack;

public class StackCollection {

    public static void main(String[] args) {

        //1.
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Текущий стек : " + stack);
        System.out.println("Удаляем : " + stack.pop());
        System.out.println("Удаляем : " + stack.pop());
        System.out.println("Удаляем : " + stack.pop());
        System.out.println("Текущий стек : " + stack);

        //2.
        Cat barsik = new Cat("Барсик", 4);
        Cat murzik = new Cat("Мурзик", 6);
        Cat vaska = new Cat("Васька", 9);
        Cat unika = new Cat("Уника", 7);

        Stack<Cat> catStack = new Stack<>();
        catStack.push(barsik);
        catStack.push(murzik);
        catStack.push(vaska);
        catStack.push(unika);

        System.out.println(catStack.search("Уника"));

        System.out.println("Текущий стек: " + catStack);
        System.out.println("Брысь " + catStack.pop());
        System.out.println("Кто последний? " + catStack.peek());
        System.out.println("Брысь " + catStack.pop());
        System.out.println("Кто последний? " + catStack.peek());
        System.out.println("Брысь " + catStack.pop());
        System.out.println("Никого? " + catStack.empty());
    }
}

class Cat {

    private String mName;
    private int mAge;

    public Cat(String name, int age) {
        mName = name;
        mAge = age;
    }

    @Override
    public String toString(){
        return this.mName;
    }
}
