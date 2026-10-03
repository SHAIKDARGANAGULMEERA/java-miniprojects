import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 50000;
        int choice = 0;

        while (choice != 4) {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    int deposit = sc.nextInt();

                    balance = balance + deposit;

                    System.out.println("Deposit successful");
                    System.out.println("New Balance: " + balance);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    int withdraw = sc.nextInt();

                    if (withdraw <= balance) {
                        balance = balance - withdraw;

                        System.out.println("Withdrawal successful");
                        System.out.println("Remaining Balance: " + balance);
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 4:
                    System.out.println("Thank you! Exiting ATM...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}