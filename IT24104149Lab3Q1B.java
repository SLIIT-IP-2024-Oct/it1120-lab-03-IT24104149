import java.util.Scanner;

public class IT24104149Lab3Q1B
{
      public static void main(String[] args) 
      {
        
          Scanner scanner = new Scanner(System.in);
        
       
          System.out.print("Enter the 1Kg rice price: ");
          double pricePerKg = scanner.nextDouble();
        
       
          System.out.print("Enter the number of kilograms: ");
          double quantity = scanner.nextDouble();
        
          double totalCost = pricePerKg * quantity;
        
          double discount = totalCost * 0.10;
        
        
          double finalAmount = totalCost - discount;
        
          System.out.println("before discount payable: " + totalCost);
          System.out.println("Discount(10%): " + discount);
          System.out.println("after discount payable: " + finalAmount);
        
          scanner.close();
     }
}
