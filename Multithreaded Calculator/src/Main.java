
import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter the operation (+, -, *, /): ");
        String operation = scanner.next();

        ThreadedCalculator calculator1 = new ThreadedCalculator(a, b, operation);
        ThreadedCalculator calculator2 = new ThreadedCalculator(a, b, operation);
        ThreadedCalculator calculator3 = new ThreadedCalculator(a, b, operation);

        calculator1.start();
        calculator2.start();
        calculator3.start();

        try {
            calculator1.join();
            calculator2.join();
            calculator3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int result1 = calculator1.getResult();
        int result2 = calculator2.getResult();
        int result3 = calculator3.getResult();

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);

        scanner.close();
    }
}
