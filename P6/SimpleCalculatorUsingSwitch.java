import java.util.Scanner;

public class SimpleCalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an arithmetic expression: ");
        String expression = input.nextLine();

        // Hint: Each capture is delimited by space.
        // Capture the numbers as int but the operator as String.
        // Then use the String you captured as the variable to your switch expression and also the case value.
        String[] parts = expression.split(" ");
        int num1 = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int num2 = Integer.parseInt(parts[2]);

        int result;
        boolean error = false;

        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("The sum is " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("The subtraction is " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("The multiplication is " + result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Math error: The divisor cannot be Zero");
                    error = true;
                } else {
                    result = num1 / num2;
                    System.out.println("The division is " + result);
                }
                break;
            default:
                System.out.println("Invalid operator.");
                error = true;
                break;
        }

        input.close();

}
}
