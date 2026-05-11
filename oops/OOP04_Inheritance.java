package oops;
// Parent class
class Animal {

    void eat() {
        System.out.println("Animal eats food");
    }
}

// Child class
class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

// Multilevel inheritance
class Puppy extends Dog {

    void weep() {
        System.out.println("Puppy weeps");
    }
}

// Hierarchical inheritance
class Cat extends Animal {

    void meow() {
        System.out.println("Cat meows");
    }
}

public class OOP04_Inheritance {

    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.weep();

        Cat c = new Cat();

        c.eat();
        c.meow();
    }
}