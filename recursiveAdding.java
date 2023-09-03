import java.util.Scanner;

public class recursiveAdding {
    static int recursiveAdd(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + recursiveAdd(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to be added recursively: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("Sum is: " + recursiveAdd(num));
    }
}
