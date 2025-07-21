import java.util.Scanner;
public class Lab1_3C
{
    public static void main(){
        System.out.println("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int result = 0;
        while(original != 0){
            int number = original % 10;
            result += number * number * number;
            original /= 10;
        }
        if(result == num){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
    }
}