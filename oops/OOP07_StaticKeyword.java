package oops;

class Student {

    String name;

    // Shared by all objects
    static String college = "ABC College";

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " " + college);
    }
}


class MathUtil {

    static int add(int a, int b) {
        return a + b;
    }
}
public class OOP07_StaticKeyword {

    public static void main(String[] args) {

        Student s1 = new Student("Nishant");
        Student s2 = new Student("Rahul");

        s1.display();
        s2.display();


         // No object needed
        System.out.println(MathUtil.add(10, 20));
    }
}

