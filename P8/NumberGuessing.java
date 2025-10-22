import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberGuessing {
    public static void main(String[] args) {
        // Create and shuffle the array
        List<Integer> numbers = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        Collections.shuffle(numbers);
        List<Integer> firstFour = numbers.subList(0, 4);

        // Game variables
        int chances = 10;
        Scanner scanner = new Scanner(System.in);
        boolean hasWon = false;

        System.out.println("Guess the first 4 numbers (no duplicates):");

        while (chances > 0 && !hasWon) {
            System.out.print("Enter your guess: ");
            String input = scanner.nextLine();
            int[] guess = new int[4];
            try {
                for (int i = 0; i < 4; i++) {
                    guess[i] = Character.getNumericValue(input.charAt(i));
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter 4 numbers.");
                continue;
            }

            int correctGuesses = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == firstFour.get(i)) {
                    correctGuesses++;
                }
            }

            System.out.println("You have score " + correctGuesses + " out of the 4 numbers. You have " + (chances - 1) + " chances left.");
            chances--;

            if (correctGuesses == 4) {
                hasWon = true;
            }
        }

        if (hasWon) {
            System.out.println("Congratulations! You have won!");
        } else {
            System.out.println("You have run out of chances. The correct numbers were " + firstFour);
        }

        scanner.close();
    }
}
