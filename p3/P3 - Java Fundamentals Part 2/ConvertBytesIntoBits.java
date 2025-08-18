import java.util.Scanner;

public class ConvertBytesIntoBits {
    
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int bytes;
        int bits;

        System.out.println("Enter the number of byte(s) to be converted: ");
        bytes = Scanner.nextInt();

        bits = bytes * 8;

        System.out.println(bytes + "byte(s) is " + bits + " bits.");


    }
}
