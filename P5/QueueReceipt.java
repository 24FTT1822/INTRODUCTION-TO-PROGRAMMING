import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class QueueReceipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter name: ");
        String userName = scanner.nextLine();

        String upperCaseUserName = userName.toUpperCase();

        File practicalFolder = new File("Practical 5");
        if (!practicalFolder.exists()) {
            practicalFolder.mkdir();
        }

        File receiptFile = new File(practicalFolder, "QReceipt.txt");

        try {
            FileWriter writer = new FileWriter(receiptFile);

            
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String formattedDateTime = dateFormat.format(new Date());
            writer.write(formattedDateTime + "\n");

            
            writer.write("Hi, " + upperCaseUserName + "\n");

            
            Random random = new Random();
            int queueNumber = random.nextInt(100) + 1;
            writer.write("Your Queue No is : " + queueNumber + "\n");

            writer.close();

            
            System.out.println("Receipt generated. Thank you.");

        } catch (IOException e) {
            System.out.println("An error occurred while generating the receipt: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
