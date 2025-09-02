import java.util.Scanner;
    interface printable{
        void printDetails();
    }
    interface showable{
        void showDetails();
    }
class student implements printable,showable{
    private String name;
    private int roll_no;
    private float marks;

    student(String name,int roll_no,float marks){
        this.name=name;
        this.roll_no=roll_no;
        this.marks=marks;
    }
    @Override
    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+roll_no);
        System.out.println("Marks: "+marks);
    }
    @Override
    public void showDetails(){
        System.out.println("Student Name: "+name+" Marks: "+marks);
    }
}
public class Lab2_2 {
   
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);

    System.out.println("Enter the Name of Student: ");
    String name=sc.nextLine();
    System.out.println("Enter The Roll No of Student:");
    int roll=sc.nextInt();
    System.out.println("Enter the Marks of Student: ");
    float marks=sc.nextFloat();

    student s=new student(name,roll,marks);
    System.out.println("Printing Student Details…");
    s.printDetails();
    System.out.println("Showing Student Information...");
    s.showDetails();
}
    
}