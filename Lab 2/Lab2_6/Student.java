package college.students;

public class Student {
    public String name = "Dhruv";
    protected int roll = 57;            
    private double marks = 99.9;         

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks); 
    }
}
