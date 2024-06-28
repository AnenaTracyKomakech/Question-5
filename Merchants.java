import java.util.Scanner;

public class Merchants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        
        int product = 1;
        int sum = 0;
        int maximum = numbers[0];

        for (int number : numbers) {
            product *= number;
            sum += number;
            if (number > maximum) {
                maximum = number;
            }
        }

        System.out.println("Product\tSum\tMaximum");
        System.out.println(product + "\t" + sum + "\t" + maximum);

        scanner.close();
    }
}
