
    import java.util.Scanner;
 class RailwayTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Railway Ticket Booking System =====");
        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Number of Adults (Age 13-60): ");
        int adults = sc.nextInt();
        System.out.print("Enter Number of Children (Age 5-12): ");
        int children = sc.nextInt();
        System.out.print("Enter Number of Senior Citizens (Age Above 60): ");
        int seniors = sc.nextInt();
        System.out.print("Enter Number of Kids Below 5 Years: ");
        int below5 = sc.nextInt();
        System.out.println("\nTravel Classes");
        System.out.println("1. Sleeper");
        System.out.println("2. AC 3 Tier");
        System.out.println("3. AC 2 Tier");
        System.out.println("4. First Class");
        System.out.print("Choose Travel Class (1-4): ");
        int choice = sc.nextInt();
        double price = 0;
        String travelClass = "";
        // Travel Class Selection
        if (choice == 1) {
            travelClass = "Sleeper";
            price = 300;
        } 
        else if (choice == 2) {
            travelClass = "AC 3 Tier";
            price = 700;
        } 
        else if (choice == 3) {
            travelClass = "AC 2 Tier";
            price = 1000;
        } 
        else if (choice == 4) {
            travelClass = "First Class";
            price = 1500;
        } 
        else {
            System.out.println("Invalid Travel Class!");

        }

        // Fare Calculation
        double adultFare = adults * price;
        double childFare = children * (price * 0.5);   // 50% discount
        double seniorFare = seniors * (price * 0.7);   // 30% discount
        double below5Fare = 0;                          // Free ticket

        double totalFare = adultFare + childFare + seniorFare + below5Fare;

        int totalTickets = adults + children + seniors + below5;

        // Output
        System.out.println("\n========== TICKET DETAILS ==========");
        System.out.println("Passenger Name      : " + name);
        System.out.println("Travel Class        : " + travelClass);

        System.out.println("\nPassengers:");
        System.out.println("Adults              : " + adults);
        System.out.println("Children (5-12)     : " + children);
        System.out.println("Senior Citizens     : " + seniors);
        System.out.println("Below 5 Years       : " + below5);

        System.out.println("\nFare Details:");
        System.out.println("Adult Fare          : ₹" + adultFare);
        System.out.println("Child Fare          : ₹" + childFare);
        System.out.println("Senior Fare         : ₹" + seniorFare);
        System.out.println("Below 5 Fare        : ₹" + below5Fare);

        System.out.println("------------------------------------");
        System.out.println("Total Tickets       : " + totalTickets);
        System.out.println("Total Amount        : ₹" + totalFare);
        System.out.println("====================================");

        sc.close();
    }
}
