import java.util.Scanner;
import java.util.Arrays;

public class AssigningGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int noOfStudent;
        while (true) {
            if (sc.hasNextInt()) {
                noOfStudent = sc.nextInt();
                if (noOfStudent > 0) break;
                System.out.print("Please enter a positive number: ");
            } else {
                System.out.print("Please enter a valid integer: ");
                sc.next();
            }
        }

        int[] marks = new int[noOfStudent];
        int best = Integer.MIN_VALUE;

        for (int i = 0; i < noOfStudent; i++) {
            System.out.print("Enter mark for student " + (i + 1) + " (0-100): ");
            int m;
            while (true) {
                if (sc.hasNextInt()) {
                    m = sc.nextInt();
                    if (m >= 0 && m <= 100) break;
                    System.out.print("Enter mark between 0 and 100: ");
                } else {
                    System.out.print("Please enter an integer: ");
                    sc.next();
                }
            }
            marks[i] = m;
            if (m > best) best = m;
        }

        int scoreA = best - 10;
        int scoreB = best - 20;
        int scoreC = best - 30;
        int scoreD = best - 40;

        char[] grade = new char[noOfStudent];
        for (int i = 0; i < noOfStudent; i++) {
            int m = marks[i];
            if (m >= scoreA) grade[i] = 'A';
            else if (m >= scoreB) grade[i] = 'B';
            else if (m >= scoreC) grade[i] = 'C';
            else if (m >= scoreD) grade[i] = 'D';
            else grade[i] = 'F';
        }

        System.out.println("\nResults:");
        for (int i = 0; i < noOfStudent; i++) {
            System.out.println("Student " + (i + 1) + " score is " + marks[i] + " and grade is " + grade[i]);
        }

        sc.close();
    }
}
