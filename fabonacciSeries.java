import java.util.Scanner;

public class fabonacciSeries {
    static int fabonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fabonacci(n - 1) + (n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("Fabonacci Series: " + fabonacci(num));
    }
}
