import java.util.Scanner;

public class addingElementsOfArray {
    static int addElements(int numArray[], int currentIndex, int sum) {
        if (currentIndex < numArray.length) {
            sum = sum + numArray[currentIndex];
            return addElements(numArray, currentIndex + 1, sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int count;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of an Array: ");
        count = scanner.nextInt();

        int numArray[] = new int[count];
        System.out.print("Enter Elements (Numbers Only): ");

        for (int i = 0; i < count; i++) {
            numArray[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(addElements(numArray, 0, 0));
    }
}
