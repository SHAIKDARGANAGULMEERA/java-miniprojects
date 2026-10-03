import java.util.Scanner;
class Mobilerechaege {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a User Name:");
      String name = sc.nextLine();
      System.out.println("Enter a phone Number:");
     long number = sc.nextInt();
      System.out.println("Enter a RecherChargeAmount::");
      int Amount = sc.nextInt();
     if (Amount>=999){
         System.out.println("Netflix + Unlimited Calls + 2GB/day");
     } else if (Amount>=599){
         System.out.println("Disney+ + Unlimited Calls + 1.5GB/day");
     } else if (Amount>=299){
         System.out.println("Unlimited Calls + 1GB/day");
     } else if (Amount>=149){
        System.out.println("Unlimited Calls + 500MB/day"); 
     } else {
         System.out.println("Talktime Only");  
     }
     sc.close();
    }
}
