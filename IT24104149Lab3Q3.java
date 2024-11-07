import java.util.Scanner;

public class IT24104149Lab3Q3 
{
    public static void main(String[] args) 
    {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        
        for (int denomination : denominations) 
            {
            int count = amount / denomination; 
            if (count > 0)
            {
                System.out.println(denomination + "/- : " + count);
            }
            amount %= denomination;            }

        scanner.close();
    }
}
