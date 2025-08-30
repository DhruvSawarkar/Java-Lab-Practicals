import java.util.Scanner;
class Calculator{
    int add(int x,int y){
        return x+y;
    }
    double add(double x,double y){
        return x+y;
    }
    int add(int x,int y,int z){
        return x+y+z;
    }
}
public class Lab2_4{
    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println("Addition of 2 integers : "+ c.add(2,4));
        System.out.println("Addition of 2 doubles : "+ c.add(2.5,4.5));
        System.out.println("Addition of 3 integers : "+ c.add(2,4,8));
    }
}