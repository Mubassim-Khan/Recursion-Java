import java.util.Scanner;

public class towerOfHanoi {
    static void solveHanoi(int n, char source, char destination, char assisting_rod) {
        // Base Case
        if (n == 0) {
            System.out.println("No disk to move");
            return;
        } else if (n == 1) {
            System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
            return;
        } else {            // Recursive Condition
            solveHanoi(n - 1, source, assisting_rod, destination);
            System.out.println("Move " + n + " disks from source rod " + source + " to destination rod " + destination);
            solveHanoi(n - 1, assisting_rod, destination, source);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int num = scanner.nextInt();
        scanner.close();

        solveHanoi(num, 'A', 'B', 'C');
    }
}