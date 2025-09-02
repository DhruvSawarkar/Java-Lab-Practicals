interface MyInterface{
    void show();
}
class Outer{
    class Inner{
        void display(){
            System.out.println("This is Inner Class");
        }
    }
    void accessInner(){
        Inner in = new Inner();
        in.display();
    }
}
public class Lab2_5{
    public static void main(String[] args){
        Outer out = new Outer();
        out.accessInner();
        
        MyInterface obj = new MyInterface(){
            public void show(){
                System.out.println("This is anonymous class");
            }
        };
        obj.show();
    }
}