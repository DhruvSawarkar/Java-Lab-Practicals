import java.util.Scanner;
public class Lab1_2
{
    static void main(){
        System.out.println("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("The given number is Even");
        }
        else{
            System.out.println("The given number is Odd");
        }
        
        boolean Prime = true;
        if(num <= 1){
            Prime = false;
        }
        else{
            for(int i=2 ; i<=Math.sqrt(num) ; i++){
                if(num % i == 0){
                    Prime = false;
                    break;
                }
            }
        }
        if(Prime){
            System.out.println("The given number is a prime number");
        }
        else{
            System.out.println("The given number is not a prime number");
        }
        
        switch(num){
            case 1:
                System.out.println("Weekday : Monday");
                break;
            case 2:
                System.out.println("Weekday : Tuesday");
                break;
            case 3:
                System.out.println("Weekday : Wednesday");
                break;
            case 4:
                System.out.println("Weekday : Thursday");
                break;
            case 5:
                System.out.println("Weekday : Friday");
                break;
            case 6:
                System.out.println("Weekday : Saturday");
                break;
            case 7:
                System.out.println("Weekday : Sunday");
                break;
            default:
                System.out.println("For WEEKDAY Enter a number between 1 and 7");
                break;
        }
    }
}