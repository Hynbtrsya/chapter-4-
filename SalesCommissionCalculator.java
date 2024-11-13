import java.util.Scanner;
public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sales = 0;
        double baseSalary = 600; // Base salary per week
        double commissionRate = 0.05; // Commission rate (5%)
        double totalSalary;

        System.out.println("Enter sales in RM (enter -1 to end):");

        while (true) {
            // Prompt user to enter sales
            System.out.print("Enter sales amount: ");
            sales = scan.nextDouble();
            
            if (sales == -1) {
                // Exit the loop if the user enters -1
                break;
            }
            
            // Calculate the commission based on sales
            double commission = sales * commissionRate;
            
            // Calculate total salary including base salary and commission
            totalSalary = baseSalary + commission;
            
            // Display the earnings for the week
            System.out.printf("Total earnings for this week: RM%.2f%n", totalSalary);
        }

        // Close the scanner
        scan.close();
    }
}