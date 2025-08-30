import java.util.Scanner;
    abstract class shape{
        abstract void calculateArea();
        void display(){
            System.out.println("Displaying shape Area....");
        }
    }
    class circle extends shape{
        int r;
        circle (int r){
            this.r=r;
        }
        void calculateArea(){
            float area=3.14f*r*r;
            System.out.println("Area of a Circle is: "+area);
        }
    }
    class rectangle extends shape{
        int l,b;
        rectangle(int l,int b){
            this.l=l;
            this.b=b;
        }
        void calculateArea(){
            int area=l*b;
            System.out.println("Area of a Rectangle is: "+area);
        }

    }
public class Lab2_1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Radius of Circle: ");
        int r=sc.nextInt();
        shape s1=new circle(r);

        System.out.println("Enter thr Length and Breadth of the Rectangle: ");
        int l=sc.nextInt();
        int b=sc.nextInt();
        shape s2=new rectangle(l,b);

        s1.display();
        s1.calculateArea();
        s2.calculateArea();

      
    }
}