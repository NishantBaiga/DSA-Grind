package oops;

class Student {
    String name;
    int age;
    int marks;
    private int rollNo;

    // constructor, constructor is use to create object, constructor name must be same as class name, constructor is called automatically when object is created, constructor is use to initialize object, a class can have multiple constructor but arguments must be different
    Student(String a, int b, int c) {
        name = a;
        age = b;
        marks = c;
        System.out.println("constructor called");
    }

    // method with return type void means it not return anything.
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    // setter , setter is use to set private variable from outside the class
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // getter , getter is use to get private variable from outside the class
    public int getRollNo() {
        return rollNo;
    }
}

// ------ showing inheritance ------//
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Dog class is child class of Animal class,Dog inherits all the properties of Animal class
// to inherit parent properties we use extends keyword
class Dog extends Animal { 
    void bark() {
        System.out.println("Dog barks");
    }
}

// ------- showing polymorphism ------//

// method overloading
class MathUtil {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// method overriding
class GermanDog extends Animal {
    @Override // to override parent method
    void sound() {
        System.out.println("Dog make scary sound");
    }
}

class Pen {
    String color;
    String type;

    void write(String m) {
        System.out.println(m);
    }

    void penColor() {
        System.out.println(this.color); // this tell class which object use this method
    }
}

// ----abstractions----//
// Abstract class can have abstract method and concrete method, abstract class can not create object, abstract class can not have constructor, abstract class can not be final, abstract class can not be static, abstract method can not have body, 
abstract class Vehicle {
    // Abstract method (no body)
    abstract void start();
    // Concrete method (has body)
    void fuelType() {
        System.out.println("Petrol or Diesel");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

// ----interfaces----//
interface Payment {
    void pay(); // abstract by default
}
class UPI implements Payment {

    public void pay() {
        System.out.println("Payment done via UPI");
    }
}

class CreditCard implements Payment {
    public void pay() {
        System.out.println("Payment done via Credit Card");
    }
}

public class object_oriented_programming {
    public static void main(String[] args) {
        Student s1 = new Student("nishant", 22, 100); // this are default values, constructor concept
        s1.name = "Rahul";
        s1.age = 20;
        s1.marks = 90;
        s1.display();

        Dog d = new Dog(); // inheritance
        d.sound(); // here dog object can access sound from animal class
        d.bark();

        MathUtil m = new MathUtil(); // polymorphism
        int a = m.add(1, 3);
        System.out.println(a);
        int b = m.add(1, 3, 4); // method overloading
        System.out.println(b);

        GermanDog g = new GermanDog(); // method overriding
        g.sound();

        Pen p1 = new Pen();
        p1.color = "red";
        p1.type = "regular";

        Pen p2 = new Pen();
        p2.color = "blue";
        p2.type = "gelPen";

        p1.penColor();
        p2.penColor();

    }
}
