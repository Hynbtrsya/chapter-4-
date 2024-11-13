import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperLimit;

        System.out.print("Enter the maximum value for Fibonacci series: ");
        upperLimit = scanner.nextInt();

        System.out.println("Fibonacci Series up to " + upperLimit + ":");

        int firstTerm = 0, secondTerm = 1;
        System.out.print(firstTerm);

        if (upperLimit > 0) {
            System.out.print(", " + secondTerm);
        }

        while (true) {
            int nextTerm = firstTerm + secondTerm;
            if (nextTerm > upperLimit) break;

            System.out.print(", " + nextTerm);

            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println(); // for newline
        scanner.close();
    }
}