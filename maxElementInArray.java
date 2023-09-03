import java.util.Scanner;

public class maxElementInArray {
    static void maxElement(int numArray[]) {
        int max = 0;
        int count = numArray.length;

        for (int i = 0; i < count; i++) {
            if (numArray[i] > max) {
                max = numArray[i];
            }
        }
        System.out.println("Max number is: " + max);
    }

    public static void main(String[] args) {
        int count;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        count = scanner.nextInt();

        int numArray[] = new int[count];
        System.out.print("Enter Elements (Numbers Only): ");

        for (int i = 0; i < count; i++) {
            numArray[i] = scanner.nextInt();
        }
        scanner.close();
        maxElement(numArray);
    }
}
