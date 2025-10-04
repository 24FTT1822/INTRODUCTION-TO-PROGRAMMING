import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int term0 = 0;
        int term1 = 1;
        int temp;

        System.out.print("Please enter the term: ");
        int n = input.nextInt();

        if (n == 0) {
            System.out.println("At term " + n + " the number is " + term0);
        } else if (n == 1) {
            System.out.println("At term " + n + " the number is " + term1);
        } else {
            for (int i = 2; i <= n; i++) {
                temp = term0 + term1;
                term0 = term1;
                term1 = temp;
            }
            System.out.println("At term " + n + " the number is " + term1);
        }
        input.close();
    }
}
