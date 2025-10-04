import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorLoop {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userScore = 0;
        int computerScore = 0;
        int rounds = 0;
        String playAgain;

        do {
            System.out.print("Enter rock (0), paper (1), scissor (2): ");
            int userChoice = scanner.nextInt();
            int computerChoice = random.nextInt(3);
            scanner.nextLine();

            String[] choices = {"rock", "paper", "scissor"};
            System.out.println("The computer is " + choices[computerChoice] + ".");

            if (userChoice == computerChoice) {
                System.out.println("It's a draw!");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                       (userChoice == 1 && computerChoice == 0) ||
                       (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You are " + choices[userChoice] + ". You win.");
                userScore++;
            } else {
                System.out.println("You are " + choices[userChoice] + ". You lose.");
                computerScore++;
            }
            rounds++;

            System.out.print("Enter y to play again: ");
            playAgain = scanner.nextLine();
        } while (playAgain.equalsIgnoreCase("y"));

        System.out.println("\nIn the total of " + rounds + " round(s), You scored " + userScore + ", Computer scored " + computerScore);

        if (userScore > computerScore) {
            System.out.println("You won!");
        } else if (userScore < computerScore) {
            System.out.println("You lose!");
        } else {
            System.out.println("It is a draw game.");
        }

        scanner.close();
    }
}
