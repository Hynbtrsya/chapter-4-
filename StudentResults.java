import java.util.Scanner;
public class StudentResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice;
        do {
            int passedCount = 0, failedCount = 0, totalCount = 0;

            System.out.println("Enter student test results (type 'done' to finish):");

            while (true) {
                System.out.print("Enter score (0-100): ");
                String input = scanner.next();

                if (input.equalsIgnoreCase("done")) break;

                try {
                    int score = Integer.parseInt(input);
                    if (score >= 50) passedCount++;
                    else failedCount++;
                    totalCount++;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number or 'done' to finish.");
                }
            }

            System.out.println("Number of students who passed: " + passedCount);
            System.out.println("Number of students who failed: " + failedCount);

            if (totalCount > 0 && (passedCount * 100.0 / totalCount) > 50) {
                System.out.println("Bonus to instructor");
            }

            System.out.print("Do you want to enter another list of test results? (yes/no): ");
            userChoice = scanner.next();
        } while (userChoice.equalsIgnoreCase("yes"));

        scanner.close();
        System.out.println("Program has ended.");
    }
}
