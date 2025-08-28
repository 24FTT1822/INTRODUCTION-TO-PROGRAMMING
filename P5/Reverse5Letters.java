import java.util.Scanner;

public class Reverse5Letters {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word;
        
        do {
            System.out.print("Enter a 5 letter words: ");
            word = input.next();
        } while (word.length() != 5);

        String ReverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            ReverseWord += word.charAt(i);
        }
        System.out.print("The reverse of the word " + word + " is " + ReverseWord);
        
    }
}
