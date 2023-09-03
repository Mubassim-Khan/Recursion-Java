import java.util.Scanner;

public class addingElementsOfArray {
    static void addElements(int numArray[]) {
        int sum = 0;
        int count = numArray.length;

        for (int i = 0; i < count; i++) {
                sum = sum + numArray[i];
            
        }
        System.out.println("Sum of elements in Array is: " + sum);
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
        addElements(numArray);
    }
}
