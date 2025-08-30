import java.util.Scanner;
class Animal{
    void sound(){
        
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat Meows");
    }
}
public class Lab2_3{
    public static void main(String[] args){
        Animal d = new Dog();
        d.sound();
        Animal c = new Cat();
        c.sound();
    }
}