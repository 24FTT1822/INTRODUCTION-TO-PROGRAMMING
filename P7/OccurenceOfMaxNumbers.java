import java.util.Scanner;

public class OccurenceOfMaxNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int largest = 0;
        int count = 0;
        int num;

        System.out.print("Enter numbers, the input ends with 0: ");

        while ((num = input.nextInt()) != 0) {
            if (num > largest) {
                largest = num;
                count = 1;
            } else if (num == largest) {
                count++;
            }
        }

        if (largest != 0) {
            System.out.println("The largest number is " + largest);
            System.out.println("The occurrence count of the largest number is " + count);
        } else {
            System.out.println("No numbers were entered except 0.");
        }

        input.close();
    }
}

