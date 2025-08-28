import java.util.Scanner;

public class ReplaceSubString {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String message = input.nextLine();

        System.out.print("Enter the substring to replace: ");
        String oldSubString = input.nextLine();

        System.out.print("Enter the replacement string: ");
        String newSubString = input.nextLine();

        String updatedMessage = message.replace(oldSubString, newSubString);
        System.out.println("The updated message is:\n " + updatedMessage);

        
        
    }
}
