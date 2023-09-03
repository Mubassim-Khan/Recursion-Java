import java.util.Scanner;

public class reverseArray {
    public static void ReverseArray(int numArray[], int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = numArray[start];
        numArray[start] = numArray[end];
        numArray[end] = temp;

        ReverseArray(numArray, start + 1, end - 1);
    }

    public static void main(String[] args) {
        // For taking Input Array
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
        ReverseArray(numArray, 0, numArray.length - 1);
        // For Printing Answer Array
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + " ");
        }
    }
}