import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        String userInput = scanner.nextLine();

        try {
            int age = Integer.parseInt(userInput);
            System.out.println("Your age is: " + age);
        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } 
        finally {
            System.out.println("Age validation check complete.");
            scanner.close();
        }
    }
}
