import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int numRows = sc.nextInt();

        for (int i = 0; i < numRows; i++) {
            // Print spaces for formatting
            for (int j = 0; j < numRows - i; j++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                // Calculate the next number using binomial coefficient logic
                number = number * (i - j) / (j + 1);
            }

            System.out.println(); // Newline after each row
        }

        sc.close();
    }
}
