import java.util.Scanner;
public class CountingNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int total = 0;
        int totalCount = 0;

        while (true) {
            System.out.print("Enter an integer, the input ends if it is 0: ");
            int number = input.nextInt();

            if (number == 0) {
                break;
            }

            if (number > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }

            total += number;
            totalCount++;
        }

        if (totalCount > 0) {
            double average = (double) total / totalCount;
            System.out.println("The number of positives is " + positiveCount);
            System.out.println("The number of negatives is " + negativeCount);
            System.out.println("The total is " + total);
            System.out.printf("The average is %.2f\n", average);
        } else {
            System.out.println("No numbers were entered except 0.");
        }
        
        input.close();
    }
}

