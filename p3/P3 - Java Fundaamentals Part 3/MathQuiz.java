import java.util.Scanner;

public class MathQuiz {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);

        System.out.println("What is " + num1 + " + " + num2 + " ? ");
        int sumAnswer = input.nextInt();
        boolean isSumCorrect = (sumAnswer == (num1 + num2));
        System.out.println(num1 + " + " + num2 + " = " + sumAnswer + " is " + isSumCorrect);

        System.out.println("What is " + num1 + " + " + num2 + " ? ");
        int modAnswer = input.nextInt();
        boolean isModCorrect = (sumAnswer == (num1 + num2));
        System.out.println(num1 + " % " + num2 + " = " + modAnswer + " is " + isModCorrect);

    }
}
