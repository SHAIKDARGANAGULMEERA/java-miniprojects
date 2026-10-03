import java.util.Scanner;

public class NumberCheckingSystem {

    public static void main(String[] args) {

        // Create Scanner
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number:");
        int x = sc.nextInt();

        // Check Positive, Negative, or Zero
        if (x > 0) {
            System.out.println("Positive number");
        } else if (x < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        // Check Even or Odd
        if (x % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // Close Scanner
        sc.close();
    }
}