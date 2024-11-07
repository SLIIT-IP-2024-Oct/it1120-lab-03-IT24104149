import java.util.Scanner;

public class IT24104149Lab3Q4
{
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a 5-degit number: ");
        int number = scanner.nextInt();
        
        if (number < 10000 || number > 99999)
          {
            System.out.println("Enter a valid 5-digit number.");
          }
        else
          {
           
            int firstDigit = number / 10000;
            int secondDigit = (number / 1000) % 10;
            int thirdDigit = (number / 100) % 10;
            int fourthDigit = (number / 10) % 10;
            int fifthDigit = number % 10;
            
            System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit + " " + fourthDigit + " " +  fifthDigit);
          }

        
        scanner.close();
    }
}
