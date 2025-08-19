import java.util.Scanner;

public class AreaOfTriangleGeometry {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter three coordinates for a triangle: ");
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        double x5 = input.nextDouble();
        double y5 = input.nextDouble();
        double x6 = input.nextDouble();
        double y6 = input.nextDouble();

        double side1 = Math.sqrt(Math.pow(x5 - x4, 2) + Math.pow(y5 - y4, 2));
        double side2 = Math.sqrt(Math.pow(x6 - x5, 2) + Math.pow(y6 - y5, 2));
        double side3 = Math.sqrt(Math.pow(x4 - x6, 2) + Math.pow(y4 - y6, 2));

        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        System.out.printf("The are of the triangle is %.1f%n", area);

        System.out.println("Enter three coordinates for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double side4 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side5 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side6 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        double s1 = (side4 + side5 + side6) / 2;
        double area1 = Math.sqrt(s1 * (s1 - side4) * (s1 - side5) * (s1 - side6));

        System.out.printf("The are of the triangle is %.1f%n", area1);
    }
}
