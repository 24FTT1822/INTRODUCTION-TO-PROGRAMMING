import java.util.Random;
import java.util.Scanner;

public class AddFourNumber {
    public static void main(String[] args) {
        
        Random random = new Random();
        int num1 = random.nextInt(100); 
        int num2 = random.nextInt(100);
        int num3 = random.nextInt(100);
        int num4 = random.nextInt(100);

        int correctSum = num1 + num2 + num3 + num4;

       
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is " + num1 + " + " + num2 + " + " + num3 + " + " + num4 + "?\n");
        int userAnswer = scanner.nextInt();

        
        if (userAnswer == correctSum) {
            System.out.println("Well done, you are correct!");
        } else {
            System.out.println("Nice try, the sum should be " + correctSum);
        }

        scanner.close();;

}
}

