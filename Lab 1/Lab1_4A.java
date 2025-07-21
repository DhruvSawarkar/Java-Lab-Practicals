import java.util.Scanner;
public class Lab1_4A
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        int sum = 0;
        System.out.println("Enter 10 numbers : ");
        for(int i=0;i<10;i++){
            num[i] = sc.nextInt();
            sum += num[i];
        }
        int max = num[0];
        int min = num[0];
        for(int i=0;i<10;i++){
            if(num[i]>max){
                max=num[i];
            }
            if(num[i]<min){
                min=num[i];
            }
        }
        double average = sum/10.0;
        System.out.println("Average : " + average);
        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);
    }
}