import java.io.*;


class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private int studentId;
    private String name;
    private double gpa;
    private transient String password; 

    public Student(int studentId, String name, double gpa, String password) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
        this.password = password;
    }

    public void printDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name      : " + name);
        System.out.println("GPA       : " + gpa);
        System.out.println("Password  : " + password); 
    }
}

public class StudentProfileManager {
    public static void main(String[] args) {
        String filename = "student.ser";

       
        Student originalStudent = new Student(57, "Dhruv Sawarkar", 9.55, "Pass123");

 
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(originalStudent);
            System.out.println("✅ Student object serialized to " + filename);
        } catch (IOException e) {
            System.out.println("❌ Error during serialization: " + e.getMessage());
        }

     
        Student loadedStudent = null;

       
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            loadedStudent = (Student) ois.readObject();
            System.out.println("\n✅ Student object deserialized from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Error during deserialization: " + e.getMessage());
        }

        if (loadedStudent != null) {
            System.out.println("\n📋 Loaded Student Details:");
            loadedStudent.printDetails();
        }
    }
}