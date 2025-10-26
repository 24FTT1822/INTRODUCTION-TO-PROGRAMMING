import java.util.*;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) arr[i] = i;

        
        Random rnd = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);
            int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
        }

        
        int[] secret = Arrays.copyOfRange(arr, 0, 4);

        int chances = 10;
        boolean won = false;

        System.out.println("Welcome to Number Guessing!");
        System.out.println("Guess the 4 secret digits (each 0-9). Order doesn't matter.");
        System.out.println("You have " + chances + " attempts. Enter 4 numbers separated by spaces.");

        while (chances > 0 && !won) {
            System.out.println("\nAttempt " + (11 - chances) + " — chances left: " + chances);
            int[] guess = new int[4];
            int gotInputs = 0;
            while (gotInputs < 4) {
                System.out.print("Enter number #" + (gotInputs + 1) + ": ");
                if (!sc.hasNextInt()) {
                    System.out.println("Please enter an integer 0-9.");
                    sc.next(); 
                    continue;
                }
                int v = sc.nextInt();
                if (v < 0 || v > 9) {
                    System.out.println("Value must be between 0 and 9.");
                    continue;
                }
                guess[gotInputs++] = v;
            }

            
            boolean[] matchedSecret = new boolean[4];
            int score = 0;
            for (int g = 0; g < 4; g++) {
                for (int s = 0; s < 4; s++) {
                    if (!matchedSecret[s] && guess[g] == secret[s]) {
                        matchedSecret[s] = true;
                        score++;
                        break;
                    }
                }
            }

            System.out.println("You matched " + score + " out of 4 numbers.");
            if (score == 4) {
                System.out.println("You Won! You got the actual numbers!");
                won = true;
                break;
            } else {
                chances--;
            }
        }

        if (!won) {
            System.out.print("\nYou Lose. The actual numbers were: ");
            for (int i = 0; i < 4; i++) {
                System.out.print(secret[i] + (i < 3 ? " " : ""));
            }
            System.out.println();
        }

        sc.close();
    }
}
