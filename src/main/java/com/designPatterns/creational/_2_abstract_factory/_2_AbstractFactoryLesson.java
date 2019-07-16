package com.designPatterns.creational._2_abstract_factory;

public class _2_AbstractFactoryLesson {

    public static void main(String[] args) {
        Factory carFactory = new AbstractFactory().createFactory("Car");
        Factory tankFactory = new AbstractFactory().createFactory("Tank2");
        Car toyota = (Car) carFactory.create("Toyota");
        Car audi = (Car) carFactory.create("Audi");
        toyota.drive();
        toyota.drive();

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

class CarFactory implements Factory {
    public Car create(String typeOfCar) {
        switch (typeOfCar) {
            case "Toyota":
                return new Toyota();
            case "Audidi":
                return new Audi();
            default:
                return null;
        }
    }
}

interface Tank2 {
    void drive();
}

class T51 implements Tank2 {
    @Override
    public void drive() {
        System.out.println("drive Toyota");
    }
}

class T52 implements Tank2 {
    @Override
    public void drive() {
        System.out.println("drive Audi");
    }
}

class TankFactory implements Factory {
    public Tank2 create(String typeOfTank) {
        switch (typeOfTank) {
            case "T51":
                return new T51();
            case "T52":
                return new T52();
            default:
                return null;
        }
    }
}

interface Factory {
    Object create(String type);
}

class AbstractFactory {
    public Factory createFactory(String typeOfFactory) {
        switch (typeOfFactory){
            case "Tank2" : return new TankFactory();
            case "Car" : return new CarFactory();
            default: return null;
        }
    }
}
