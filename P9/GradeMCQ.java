import java.util.Scanner;

public class GradeMCQ {
    public static void main(String[] args) {
        // Student answers to the questions
        char[][] answers = {
            {'A', 'B', 'C', 'D', 'A', 'B'},
            {'C', 'D', 'D', 'A', 'B', 'D'},
            {'D', 'D', 'A', 'B', 'B', 'A'},
            {'C', 'A', 'D', 'A', 'B', 'C'}
        };

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        char[] key = new char[6];

        System.out.println("Enter the 6 correct answers for the test (e.g., ABCDEF):");
        String keyString = input.nextLine().toUpperCase();
        for (int i = 0; i < 6; i++) {
            key[i] = keyString.charAt(i);
        }

        // Pass mark is 50% (3 out of 6 correct answers)
        int passMark = 3;

        // Display results
        System.out.println("\n--- Test Results ---");

        // Grade all answers
        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == key[j]) {
                    correctCount++;
                }
            }
            String result = (correctCount >= passMark) ? "Pass" : "Fail";
            System.out.println("Student " + (i + 1) + ": " + correctCount + " correct answers. Result: " + result);
        }
        input.close();
    }
}
