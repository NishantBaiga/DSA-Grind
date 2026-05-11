package oops;

// Method Overloading
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Method Overriding
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OOP05_Polymorphism {

    public static void main(String[] args) {

        // Overloading
        Calculator cal = new Calculator();

        System.out.println(cal.add(10, 20));
        System.out.println(cal.add(10, 20, 30));

        // Overriding
        Animal a = new Dog();

        a.sound();
    }
}