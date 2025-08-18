import java.util.Scanner;

public class Savings {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your target amount? $");
        double targetAmount = input.nextDouble();

        System.out.println("How many month(s) to reach your goal? ");
        int months = input.nextInt();

        int days = months * 30;
        double amountPerDay = targetAmount / days;

        System.out.printf("The amount you need to save per day is $%.2f\n", amountPerDay);
    }
}
