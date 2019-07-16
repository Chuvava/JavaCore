package com.javacore.referenceobjects;

public class Program{

    public static void main(String[] args) throws CloneNotSupportedException {

//        Person tom = new Person("Tom", 23);
//        tom.display();      // Person Tom
//        Person bob = tom.clone();
//        bob.setName("Bob");
//        tom.display();      // Person Bob

        try{
            Book book = new Book("War and Peace", "Leo Tolstoy");
            Book book2 = book.clone();
            book2.setAuthor("Ivan Turgenev");
            System.out.println(book.getAuthor());
        }
        catch(CloneNotSupportedException ex){

            System.out.println("Cloneable not implemented");
        }
    }
}
class Person implements Cloneable{
    private String name;
    private int age;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void display(){
        System.out.printf("Person Name: %s \nAge: %d \n", name, age);
    }
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
