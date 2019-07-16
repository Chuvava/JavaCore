package com.designPatterns.creational._1_factory_method;

public class _1_FactoryLesson {

    //https://www.youtube.com/watch?v=A4uNotdECBg&list=PL786bPIlqEjRMh8_H4EBkxXlLis-Ag4na&index=2
    //Фабричный метод — это порождающий паттерн проектирования, который определяет общий интерфейс для создания объектов в суперклассе,
    //позволяя подклассам изменять тип создаваемых объектов.
    //https://refactoring.guru/ru/design-patterns/factory-method

    public static void main(String[] args) {
        Factory factory = new Factory();
        Car toyota = factory.create("Toyota");
        Car audi = factory.create("Audi");
        toyota.drive();
        audi.drive();
    }
}

interface Car {
    void drive();
}

class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("drive Toyota");
    }
}

class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("drive Audi");
    }
}

class Factory {

    public Car create(String typeOfCar) {
        switch(typeOfCar){
            case "Toyota" : return new Toyota();
            case "Audi" : return new Audi();
            default: return null;
        }
    }
}
