import java.util.Scanner;

public class PriceComparison {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the price of the 1st package: $");
        double price1 = input.nextDouble();
        System.out.println("Enter the weight of the 1st package in gram: ");
        double weight1 = input.nextDouble();

        System.out.println("Enter the price of the 2nd package: $");
        double price2 = input.nextDouble();
        System.out.println("Enter the weight of the 2nd package in gram: ");
        double weight2 = input.nextDouble();

        double value1 = weight1 / price1;
        double value2 = weight2 / price2;

        String result = (value1 > value2) ?
        "it is worth more to buy the 1st package.":
        "it is worth more to buy the 2nd package.";
        System.out.println(result);

        System.out.println("Enter the price of the 1st package: $");
        double price3 = input.nextDouble();
        System.out.println("Enter the weight of the 1st package in gram: ");
        double weight3 = input.nextDouble();

        System.out.println("Enter the price of the 2nd package: $");
        double price4 = input.nextDouble();
        System.out.println("Enter the weight of the 2nd package in gram: ");
        double weight4 = input.nextDouble();

        double value3 = weight3 / price3;
        double value4 = weight4 / price4;

        String result1 = (value3 > value4) ?
        "it is worth more to buy the 1st package.":
        "it is worth more to buy the 2nd package.";
        System.out.println(result1);
    }
}
