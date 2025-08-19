import java.util.Scanner;

public class ReverseOfInteger {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);


        System.out.println("Enter an integer between 100 and 999");
        int number = input.nextInt();


        int digit1 = number % 10;
        int remaining = number / 10;
        int digit2 = remaining % 10;
        int digit3 = remaining / 10;


        System.out.println("The reverse of " + number + " is " + digit1 + digit2 + digit3);

        System.out.println("Enter an integer between 100 and 999");
        int number1 = input.nextInt();


        int digit4 = number1 % 10;
        int remaining1 = number1 / 10;
        int digit5 = remaining1 % 10;
        int digit6 = remaining1 / 10;


        System.out.println("The reverse of " + number + " is " + digit4 + digit5 + digit6);
    }
}
