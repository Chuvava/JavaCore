package com.collections;

public class ForExperimenting {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        int numOfProcessors = runtime.availableProcessors();
        System.out.println("Num of processors : " + numOfProcessors);

    }
}
