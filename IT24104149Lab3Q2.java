import java.util.Scanner;

public class IT24104149LabQ2
{
    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("monthly salary: ");
        double monthlySalary = scanner.nextDouble();
        
        System.out.print("number of OT hours: ");
        double otHours = scanner.nextDouble();
        
        System.out.print("OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();
       
        double otAmount = otHours * otHourlyRate;
        
        double totalSalary = monthlySalary + otAmount;
        
        System.out.println("The total salary is: " + totalSalary);
        
        scanner.close();
    }
}
