import java.util.Scanner;

public class maxElementInArray {
    static int maxElement(int numArray[], int currentIndex, int max) {
        if (currentIndex < numArray.length) {
            if (numArray[currentIndex] > max) {
                max = numArray[currentIndex];
            }
            return maxElement(numArray, currentIndex + 1, max);
        }
        return max;
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

        System.out.println("Largest Number in Array is: " + maxElement(numArray, 0, 0));
    }
}
