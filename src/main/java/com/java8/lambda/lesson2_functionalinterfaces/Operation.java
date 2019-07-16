package com.java8.lamba.lesson2_functionalinterfaces;

public interface Operation<T> {

    T getResult(T v1, T v2);
}
