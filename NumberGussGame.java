import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Create Random object
        Random random = new Random();

        // Generate a random number between 1 and 100
        int secret = random.nextInt(100) + 1;

        System.out.println("================================");
        System.out.println("      NUMBER GUESSING GAME");
        System.out.println("================================");
        System.out.println("I selected a number between 1 and 100.");

        // Keep asking until the user guesses correctly
        while (true) {

            // Take user's guess
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            // Compare user's guess with secret number
            if (num < secret) {
                System.out.println("Too Low! Try again.");
            }

            else if (num > secret) {
                System.out.println("Too High! Try again.");
            }

            else {
                System.out.println("It's Correct! 🎉");
                System.out.println("Congratulations!");
                break;
            }
        }

        sc.close();
    }
}