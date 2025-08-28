import java.util.Scanner;

public class WordComparison {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = input.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = input.nextLine();

        String lowerWord1 = word1.toLowerCase();
        String lowerWord2 = word2.toLowerCase();

        boolean areSame = lowerWord1.equals(lowerWord2);

        System.out.print("Are both words the same? " + areSame);

        input.close();
        
        
    }
}
