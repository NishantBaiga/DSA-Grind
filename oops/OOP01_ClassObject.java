package oops;
class Student {

    // Instance variables
    String name;
    int age;

    // Method
    void display() {
        System.out.println(name + " " + age);
    }
}

public class OOP01_ClassObject {

    public static void main(String[] args) {

        // Object creation
        Student s1 = new Student();

        // Assign values
        s1.name = "Nishant";
        s1.age = 22;

        // Method call
        s1.display();
    }
}