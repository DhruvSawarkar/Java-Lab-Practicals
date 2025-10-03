abstract class Person  { 
    String name;
    String id;

    Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    abstract String getRole();
    void displayInfo() {  
        System.out.println("Role: " + getRole());
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

interface Login {
    boolean login(String username, String password);
}

class Student extends Person implements Login {
    private String studentUsername = "student123";
    private String studentPassword = "pass123";

    Student(String name, String id) {
        super(name, id);
    }
    String getRole() {
        return "Student";
    }

    public boolean login(String username, String password) {
        if (username.equals(studentUsername) && password.equals(studentPassword)) {
            System.out.println("Student Login Successful");
            return true;
        } else {
            System.out.println("Student Login Failed");
            return false;
        }
    }
}

class Faculty extends Person implements Login {
    private String facultyUsername = "faculty123";
    private String facultyPassword = "teach123";

    Faculty(String name, String id) {
        super(name, id);
    }

    String getRole() {
        return "Faculty";
    }

    public boolean login(String username, String password) {
        if (username.equals(facultyUsername) && password.equals(facultyPassword)) {
            System.out.println("Faculty Login Successful");
            return true;
        } else {
            System.out.println("Faculty Login Failed");
            return false;
        }
    }
}

public class Lab3_2 {
    public static void main(String[] args) {
        Login p1 = new Student("Dhruv Sawarkar", "57");
        Login p2 = new Faculty("Java Faculty", "F101");

        if (p1.login("student123", "pass123")) {
            ((Person)p1).displayInfo();
        }

        System.out.println();

        if (p2.login("faculty123", "teach123")) {
            ((Person)p2).displayInfo();
        }
    }
}
