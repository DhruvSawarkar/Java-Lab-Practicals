import java.util.Scanner;
public class Lab1_3A{
    public static void main(){
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Multiplication of " + num + " : ");
        for(int i=1 ; i<=10 ; i++){
            System.out.println(num + "x" + i + "=" + (num*i));
            break;
        }
    }
}