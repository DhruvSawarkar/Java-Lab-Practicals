import java.util.Scanner;
public class Lab1_3B
{
    public static void main(){
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x=0 , y=1;
        System.out.println("Fibonacci Series Upto " + num + " Numbers ");
        for(int i=1 ; i<=num ; i++){
            System.out.println(x + " ");
            int z= x+y;
            x=y;
            y=z;
        }
    }
}