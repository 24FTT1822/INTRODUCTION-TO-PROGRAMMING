import java.util.Scanner;

public class CharacterToUnicode {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char character = input.next().charAt(0);
        int unicodeValue = (int) character;

        System.out.println("The Unicode for character " + character + " is " + unicodeValue);
    }
    }
}
