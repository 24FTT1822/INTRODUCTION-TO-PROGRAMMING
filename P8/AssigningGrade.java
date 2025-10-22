import java.util.Scanner;

public class AssigningGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        int[] scores = new int[numStudents];
        char[] grades = new char[numStudents];
        int bestScore = 0;

        // Step 1: Get scores and find the best score
        System.out.println("Enter " + numStudents + " scores:");
        for (int i = 0; i < numStudents; i++) {
            scores[i] = input.nextInt();
            if (scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }

        // Step 2: Assign grades
        for (int i = 0; i < numStudents; i++) {
            if (scores[i] >= bestScore - 10) {
                grades[i] = 'A';
            } else if (scores[i] >= bestScore - 20) {
                grades[i] = 'B';
            } else if (scores[i] >= bestScore - 30) {
                grades[i] = 'C';
            } else if (scores[i] >= bestScore - 40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        // Step 3: Display results
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[i]);
        }
    }
}
