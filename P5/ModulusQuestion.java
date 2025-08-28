import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ModulusQuestion {
    
    public static void main(String[] args) throws IOException {
        
        String filename = "C:/data/ModulusQuestion";
        //FileWriter fw = new FileWriter(filename); //signle arguments means overwrite mode
        FileWriter fw = new FileWriter(filename, true); //two arguments means append mode
        

        int limit=100;
        limit=limit+1; // ani tambah + 1 sebab tuk dpt kn 10 digit so mesti naikkan limitnya

        int randomlimit = (int) (Math.random()*limit);
        int randomlimit2 = (int) (Math.random()*limit);
        fw.write(+ randomlimit2 + " % " + randomlimit + " = ?\n ");

        fw.close();


        // Random rand = new Random();
        // int num1 = rand.nextInt(100) + 1;
        // int num2 = rand.nextInt(10) + 1;
        // String question = num1 + " & " + num2 + " = ?";
        // String answer = String.valueOf(num1 % num2);

        // File folder = new File("Practical 5");
        // if (!folder.exists()) {
        //     folder.mkdir();
        // }
        
        // File file = new File(folder, "Modulus Question.txt");

        //  (FileWriter writer) = new FileWriter(file, true) {}
        //     writer.write("Question: " + question + "\r\n");
        //     writer.write("Answer: " + answer + "\r\n\r\n");
        
        

            System.out.print("A new modulus question has been added to Modulus Question.txt!");
            

        
    }
}
