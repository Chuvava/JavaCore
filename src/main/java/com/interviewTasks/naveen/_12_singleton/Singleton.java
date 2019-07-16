package com.interviewTasks.naveen._12_singleton;

public class Singleton {

    //In OOP, a singleton class is a class that can have onlye one object(instance of the class) at a time
    //How to design singleton class :
    //1. make constructor as private
    //2. write a public static method(getInstance) that has return type of object of this singleton class (Lazy Initialization)

    //diff bw normal class and singleton class;

    private static Singleton singleton_instance = null;
    public String str;

    private Singleton() {
        str = "Hey, I am using Singleton";
    }

    public static Singleton getInstance(){
        if(singleton_instance == null){
            singleton_instance = new Singleton();
        }
        return singleton_instance;
    }

    public static void main(String[] args) {

        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        x.str = "changed string";

        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);

    }
}
