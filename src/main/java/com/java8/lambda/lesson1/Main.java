package com.java8.lambda.lesson1;

public class Main {

    //link=https://www.youtube.com/watch?v=WmMavkXMXDg&list=PLGbj5Xe61j2AtfTH01DbMXTkT5skz8P6a&index=1

    public static void main(String[] args) {

        double value1 = 2.0, value2 = 2.0;

        Operation operation = () -> {
            return value1 + value2;
        };
        System.out.println(operation.getResult());
        System.out.println(value1);
        System.out.println(value2);

//        Operation operation2 = new Operation() {
//            @Override
//            public double getResult(double value1, double value2) {
//                return value1 + value1;
//            }
//        };
//
//        System.out.println(operation2.getResult(48, 16));
//
//        Operation lambda = (value1, value2) -> value1 * value2;
//        System.out.println(lambda.getResult(6, 13));

        Printer printer = text -> System.out.println(text);
        printer.println("Hello world");

        Factorial factorial = value -> {
          int result = 1;

          for(int i = 1; i <= value; ++i){
              result *= i;
          }

          return result;
        };

        System.out.println(factorial.getResult(5));
    }

}
