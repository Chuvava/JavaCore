package com.java8.lambda.june;

public class NestedClasses {

    public void doSMth(){
        InnerClass innerClass = new InnerClass();

    }

    class InnerClass {
        private int age;
        private String name;

        public InnerClass() {
        }

        public InnerClass(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

class OuterClass {
    public interface ImNonStaticInterface {
        int convert(long number);
    }
}
