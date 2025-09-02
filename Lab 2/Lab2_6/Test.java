package test;

import college.students.Student;

public class Test extends Student {
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println("Accessing public: " + s.name);

        Test t = new Test();
        System.out.println("Accessing protected: " + t.roll);

    }
}
