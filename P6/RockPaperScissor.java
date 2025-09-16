
    
    import java.util.Random;
    import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter rock (0), paper (1), scissor (2)");
        int playerChoice = input.nextInt();

        int computerBigRandom = random.nextInt();
        int computerChoice = Math.abs(computerBigRandom % 3);

        String[] choices = {"rock", "paper", "scissor"};
        System.out.println("The computer is " + choices[computerChoice] + ".");

        if (playerChoice == computerChoice) {
            System.out.println("You are " + choices[playerChoice] + ". It is a draw.");
        }

        if (playerChoice == 0 && computerChoice == 2) { 
            System.out.println("You are " + choices[playerChoice] + ". You Win.");
        }
        if (playerChoice == 1 && computerChoice == 0) { 
            System.out.println("You are " + choices[playerChoice] + ". You Win.");
        }
        if (playerChoice == 2 && computerChoice == 1) { 
            System.out.println("You are " + choices[playerChoice] + ". You Win.");
        }

        
        if (playerChoice == 0 && computerChoice == 1) { 
            System.out.println("You are " + choices[playerChoice] + ". You Lose.");
        }
        if (playerChoice == 1 && computerChoice == 2) { 
            System.out.println("You are " + choices[playerChoice] + ". You Lose.");
        }
        if (playerChoice == 2 && computerChoice == 0) { 
            System.out.println("You are " + choices[playerChoice] + ". You Lose.");
        }

        input.close();;

}
}

