import java.util.Scanner;

public class reverseArray {
    public static void ReverseArray(int numArray[]) {
        int temp;
        int count = numArray.length;

        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (numArray[i] < numArray[j]) {
                    temp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }
        System.out.println("Array elements sorted in Descending order are: ");
        for (int i = 0; i < count - 1; i++) {
            System.out.print(numArray[i] + " ");
        }
        System.out.println(numArray[count - 1]);
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
        ReverseArray(numArray);
    }
}