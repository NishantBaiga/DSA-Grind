package oops;
class Employee {

    String name;
    int age;
    String company;

    // Default constructor
    Employee() {
        System.out.println("Default Constructor");
    }

    // Parameterized constructor
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor Overloading
    Employee(String name, int age, String company) {

        // Constructor Chaining
        this(name, age);

        this.company = company;
    }

    void display() {
        System.out.println(name + " " + age + " " + company);
    }
}

public class OOP02_Constructors {

    public static void main(String[] args) {

        Employee e1 = new Employee();

        Employee e2 = new Employee("Nishant", 22);

        Employee e3 = new Employee(
                "Nishant",
                22,
                "Google"
        );

        e3.display();
    }
}