import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleLoginValidation {

    public static void main(String[] args) {
        
        String correctUsername = "Ahmad Ali";
        String correctPassword = "12345";

        
        Scanner input = new Scanner(System.in);

        
        System.out.println("Please enter your username:");
        String enteredUsername = input.nextLine();

        
        System.out.println("Please enter the password:");
        String enteredPassword = input.nextLine();

        
        if (enteredUsername.equals(correctUsername)) {
            if (enteredPassword.equals(correctPassword)) {
                
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss"); 
                String currentTime = sdf.format(new Date());
                System.out.println("Welcome, " + correctUsername + "! Current time: " + currentTime);
            } else {
                
                System.out.println("Error: Password does not match.");
            }
        } else {
            
            System.out.println("Error: Invalid Username.");
        }

        
        input.close();;
}
}
