import java.util.Scanner;
import java.util.Arrays;

public class ShiftingElementByInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int;
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of left shifts: ");
        int shift = scanner.nextInt();

        System.out.println("Original array: " + Arrays.toString(arr));

        for (int i = 0; i < shift; i++) {
            int first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }

        System.out.println("Array after " + shift + " left shifts: " + Arrays.toString(arr));

        scanner.close();
    }
}
