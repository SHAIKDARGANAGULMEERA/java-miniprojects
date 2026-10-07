
import java.util.Scanner;

public class ShoppingBill {

    // Display Bill Method
    static void displayBill(String product, int price, int quantity,
                            int amount, int discount,
                            int finalValue, int gst, int totalAmount) {

        System.out.println("\n========== SHOPPING BILL ==========");
        System.out.println("Product      : " + product            );
        System.out.println("Price        : " + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Amount       : " + amount);
        System.out.println("Discount     : " + discount);
        System.out.println("Final Value  : " + finalValue);
        System.out.println("GST (18%)    : " + gst);
        System.out.println("Total Amount : " + totalAmount);
        System.out.println("===================================");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Collect information from user

        System.out.print("Enter a Product Name: ");
        String product = sc.nextLine();

        System.out.print("Enter a Price: ");
        int price = sc.nextInt();

        System.out.print("Enter a Quantity: ");
        int quantity = sc.nextInt();

        // Calculate Amount
        int amount = price * quantity;

        // Check the discount
        int discount = 0;

        if (amount >= 500) {
            discount = amount * 10 / 100;

        } else if (amount >= 300) {
            discount = amount * 5 / 100;

        } else if (amount >= 200) {
            discount = amount * 3 / 100;

        } else {
            discount = 0;
        }

        // Calculate final value
        int finalValue = amount - discount;

        // Calculate GST
        int gst = finalValue * 18 / 100;

        // Calculate total amount
        int totalAmount = finalValue + gst;

        // Array
        int[] arr = new int[4];

        arr[0] = price;
        arr[1] = quantity;
        arr[2] = amount;
        arr[3] = finalValue;

        // Call display method
        displayBill(product, price, quantity, amount, discount,
                    finalValue, gst, totalAmount);

        sc.close();
    }
}

