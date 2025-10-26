import java.util.Scanner;

public class EliminateDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int SIZE = 10;
        int[] number = new int[SIZE];

        System.out.println("Enter 10 integers (space or newline separated):");
        for (int i = 0; i < SIZE; i++) {
            while (!sc.hasNextInt()) {
                System.out.println("Please enter an integer:");
                sc.next();
            }
            number[i] = sc.nextInt();
        }

        
        for (int a = 0; a < SIZE - 1; a++) {
            for (int b = a + 1; b < SIZE; b++) {
                if (number[a] == number[b]) {
                    number[b] = 0; 
                }
            }
        }

        System.out.print("The distinct numbers are: ");
        boolean anyPrinted = false;
        for (int i = 0; i < SIZE; i++) {
            if (number[i] == 0) continue; 
            System.out.print(number[i] + (i < SIZE - 1 ? " " : ""));
            anyPrinted = true;
        }
        if (!anyPrinted) {
            System.out.print("None (all entries were duplicates or zero).");
        }
        System.out.println();

        sc.close();
    }
}
