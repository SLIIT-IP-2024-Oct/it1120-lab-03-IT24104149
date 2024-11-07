import java.util.Scanner;

public class IT24104149Lab3Q1A
{
       public static void main(String[] args)
       {
        
          Scanner scanner = new Scanner(System.in);

        
          System.out.print("Enter the 1kg rice price: ");
          double pricePerKg = scanner.nextDouble();

        
          System.out.print("Enter the number of kilograms: ");
          double quantity = scanner.nextDouble();

      
          double totalAmount = pricePerKg * quantity;

          System.out.println("you have to pay is: " + totalAmount);

        
          scanner.close();
       }
}
