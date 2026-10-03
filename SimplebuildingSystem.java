import java.util.Scanner;

public class SimplebuildingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // step 1
        System.out.print("Enter the product Name: ");
        String product = sc.nextLine();

        // step 2
        System.out.print("Enter the price: ");
        int price = sc.nextInt();

        // step 3
        System.out.print("Enter the Quantity: ");
        int quantity = sc.nextInt();

        // Calculate Item Total
        int itemTotal = price * quantity;

        int discount = 0;

        // Check Condition
        if (itemTotal > 1000) {
            discount = itemTotal * 10 / 100;
        }
        else if (itemTotal > 500) {
            discount = itemTotal * 5 / 100;
        }

        int finalAmount = itemTotal - discount;

        // Display Bill
        System.out.println("\n===== BILL =====");
        System.out.println("Product: " + product);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Item Total: " + itemTotal);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);

        sc.close();
    }
}
///