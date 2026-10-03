import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean option = true;
        System.out.println("***** CALCULATOR *****");
        while (option) {
            System.out.println("-------------------------|");
            System.out.println("1. Addition              |");
            System.out.println("2. Subtraction           |");
            System.out.println("3. Multiplication        |");
            System.out.println("4. Division              |");
            System.out.println("5. Exit                  |");
            System.out.println("-------------------------");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    int n = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int m = sc.nextInt();
                    System.out.println("Result = " + (n + m));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    n = sc.nextInt();
                    System.out.print("Enter second number: ");
                    m = sc.nextInt();
                    System.out.println("Result = " + (n - m));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    n= sc.nextInt();
                    System.out.print("Enter second number: ");
                    m = sc.nextInt();
                    System.out.println("Result = " + (n * m));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    n = sc.nextInt();

                    System.out.print("Enter second number: ");
                    m = sc.nextInt();
                    if (m != 0) {
                        System.out.println("Result = " + (n / m));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    option = false;
                    System.out.println("Thank You for Using Calculator!");
                    break;
                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }
        sc.close();
    }
}